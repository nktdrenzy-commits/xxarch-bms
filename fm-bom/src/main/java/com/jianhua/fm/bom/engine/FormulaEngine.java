package com.jianhua.fm.bom.engine;

import cn.hutool.core.util.StrUtil;
import cn.hutool.core.util.ReUtil;
import lombok.Data;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.regex.Matcher;

/**
 * 公式解析引擎
 * 核心组件：负责解析和执行公式表达式
 * 
 * 支持语法：
 * - 基本运算：+ - × ÷
 * - 括号：( )
 * - 条件：if(条件, 真值, 假值)
 * - 比较：> < >= <= == !=
 */
public class FormulaEngine {

    /**
     * 公式表达式正则
     */
    private static final String FORMULA_REF_REGEX = "\\{([^}]+)\\}";

    /**
     * 计算上下文
     */
    @Data
    public static class CalcContext {
        private Map<String, BigDecimal> variables = new HashMap<>();
        private Map<String, Object> features = new HashMap<>();
        
        public void setVariable(String name, BigDecimal value) {
            variables.put(name, value);
        }
        
        public BigDecimal getVariable(String name) {
            return variables.get(name);
        }
        
        public void setFeature(String materialCode, String attrName, Object value) {
            features.put(materialCode + ":" + attrName, value);
        }
        
        public Object getFeature(String materialCode, String attrName) {
            return features.get(materialCode + ":" + attrName);
        }
    }

    /**
     * 解析并计算公式表达式
     * @param formulaExpr 公式表达式，如：{米重}×{下料长度}÷{损耗率}
     * @param context 计算上下文
     * @return 计算结果
     */
    public BigDecimal calculate(String formulaExpr, CalcContext context) {
        if (StrUtil.isBlank(formulaExpr)) {
            return BigDecimal.ZERO;
        }
        
        // 替换变量引用
        String expr = replaceVariables(formulaExpr, context);
        
        // 解析if表达式
        expr = parseIfExpression(expr, context);
        
        // 计算结果
        return eval(expr);
    }

    /**
     * 替换变量引用为实际值
     */
    private String replaceVariables(String formulaExpr, CalcContext context) {
        Matcher matcher = java.util.regex.Pattern.compile(FORMULA_REF_REGEX).matcher(formulaExpr);
        StringBuffer sb = new StringBuffer();
        
        while (matcher.find()) {
            String varName = matcher.group(1);
            BigDecimal value = context.getVariable(varName);
            String replacement = value != null ? value.toString() : "0";
            matcher.appendReplacement(sb, Matcher.quoteReplacement(replacement));
        }
        matcher.appendTail(sb);
        
        return sb.toString();
    }

    /**
     * 解析if表达式
     * if(条件, 真值, 假值)
     */
    private String parseIfExpression(String expr, CalcContext context) {
        // 递归处理所有if表达式
        while (expr.contains("if(")) {
            int ifStart = expr.indexOf("if(");
            int openParen = findMatchingParen(expr, ifStart + 2);
            
            if (openParen == -1) {
                break;
            }
            
            // 提取if参数
            String ifContent = expr.substring(ifStart + 3, openParen);
            String[] parts = splitArgs(ifContent);
            
            if (parts.length < 3) {
                break;
            }
            
            // 计算条件
            boolean condition = evaluateCondition(parts[0]);
            String result = condition ? parts[1] : parts[2];
            
            // 替换if表达式
            expr = expr.substring(0, ifStart) + "(" + result + ")" + expr.substring(openParen + 1);
        }
        
        return expr;
    }

    /**
     * 评估条件表达式
     */
    private boolean evaluateCondition(String condition) {
        // 支持：> < >= <= == !=
        String[] operators = {">=", "<=", "!=", "==", ">", "<"};
        
        for (String op : operators) {
            int idx = condition.indexOf(op);
            if (idx > 0) {
                String left = condition.substring(0, idx).trim();
                String right = condition.substring(idx + op.length()).trim();
                
                BigDecimal leftVal = new BigDecimal(left);
                BigDecimal rightVal = new BigDecimal(right);
                
                return switch (op) {
                    case ">" -> leftVal.compareTo(rightVal) > 0;
                    case "<" -> leftVal.compareTo(rightVal) < 0;
                    case ">=" -> leftVal.compareTo(rightVal) >= 0;
                    case "<=" -> leftVal.compareTo(rightVal) <= 0;
                    case "==" -> leftVal.compareTo(rightVal) == 0;
                    case "!=" -> leftVal.compareTo(rightVal) != 0;
                    default -> false;
                };
            }
        }
        
        return false;
    }

    /**
     * 分割参数（简单实现）
     */
    private String[] splitArgs(String content) {
        // 按逗号分割，忽略括号内的逗号
        List<String> args = new ArrayList<>();
        int depth = 0;
        int last = 0;
        
        for (int i = 0; i < content.length(); i++) {
            char c = content.charAt(i);
            if (c == '(' || c == '[') depth++;
            else if (c == ')' || c == ']') depth--;
            else if (c == ',' && depth == 0) {
                args.add(content.substring(last, i).trim());
                last = i + 1;
            }
        }
        
        args.add(content.substring(last).trim());
        return args.toArray(new String[0]);
    }

    /**
     * 查找匹配的括号
     */
    private int findMatchingParen(String expr, int start) {
        int depth = 1;
        for (int i = start; i < expr.length(); i++) {
            if (expr.charAt(i) == '(') depth++;
            else if (expr.charAt(i) == ')') {
                depth--;
                if (depth == 0) return i;
            }
        }
        return -1;
    }

    /**
     * 计算数学表达式
     */
    private BigDecimal eval(String expr) {
        expr = expr.replace("×", "*").replace("÷", "/");
        
        // 使用简单递归下降解析
        return evalAddSub(expr);
    }

    private BigDecimal evalAddSub(String expr) {
        // 先处理乘除
        StringBuilder sb = new StringBuilder();
        List<String> terms = new ArrayList<>();
        List<Character> ops = new ArrayList<>();
        
        int depth = 0;
        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            if (c == '(' || c == '[') depth++;
            else if (c == ')' || c == ']') depth--;
            
            if (depth == 0 && (c == '+' || c == '-')) {
                if (c == '-' && sb.length() == 0) {
                    sb.append(c);
                } else {
                    terms.add(sb.toString());
                    ops.add(c);
                    sb = new StringBuilder();
                }
            } else {
                sb.append(c);
            }
        }
        terms.add(sb.toString());
        
        // 计算乘除
        BigDecimal result = evalMulDiv(terms.get(0));
        for (int i = 1; i < terms.size(); i++) {
            BigDecimal next = evalMulDiv(terms.get(i));
            if (ops.get(i - 1) == '+') {
                result = result.add(next);
            } else {
                result = result.subtract(next);
            }
        }
        
        return result;
    }

    private BigDecimal evalMulDiv(String term) {
        List<String> factors = new ArrayList<>();
        List<Character> ops = new ArrayList<>();
        
        StringBuilder sb = new StringBuilder();
        int depth = 0;
        
        for (int i = 0; i < term.length(); i++) {
            char c = term.charAt(i);
            if (c == '(' || c == '[') depth++;
            else if (c == ')' || c == ']') depth--;
            
            if (depth == 0 && (c == '*' || c == '/')) {
                factors.add(sb.toString());
                ops.add(c);
                sb = new StringBuilder();
            } else {
                sb.append(c);
            }
        }
        factors.add(sb.toString());
        
        BigDecimal result = new BigDecimal(factors.get(0).trim());
        for (int i = 1; i < factors.size(); i++) {
            BigDecimal next = new BigDecimal(factors.get(i).trim());
            if (ops.get(i - 1) == '*') {
                result = result.multiply(next);
            } else {
                result = result.divide(next, 6, RoundingMode.HALF_UP);
            }
        }
        
        return result;
    }
}