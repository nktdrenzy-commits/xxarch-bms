package com.jianhua.fm.bom.entity;

import com.jianhua.fm.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 计算对象实体
 * 用于在公式中作为运算取值
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BomCalcObject extends BaseEntity {

    /**
     * 计算对象编码
     */
    private String objectCode;

    /**
     * 计算对象名称（公式中标识符）
     */
    private String objectName;

    /**
     * 类型：1输入值 2子项特征 3父项特征 4常数 5公式计算
     */
    private Integer objectType;

    /**
     * 输入项字段（输入值类型，对应BOM表头字段名）
     */
    private String inputField;

    /**
     * 特征属性名（子项/父项特征类型）
     */
    private String featureAttr;

    /**
     * 参数值（常数类型）
     */
    private BigDecimal constValue;

    /**
     * 关联计算公式ID（公式计算类型）
     */
    private Long relatedFormulaId;
}