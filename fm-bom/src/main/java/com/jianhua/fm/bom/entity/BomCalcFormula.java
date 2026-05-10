package com.jianhua.fm.bom.entity;

import com.jianhua.fm.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 计算公式表头
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BomCalcFormula extends BaseEntity {

    /**
     * 公式编码
     */
    private String formulaCode;

    /**
     * 公式名称
     */
    private String formulaName;

    /**
     * 公式类型：1计算对象公式 2物料公式
     */
    private Integer formulaType;

    /**
     * 关联计算对象ID（计算对象公式时）
     */
    private Long calcObjectId;

    /**
     * 公式表达式
     * 如：{米重}×{下料长度}÷{损耗率}
     */
    private String formulaExpr;

    /**
     * 公式描述
     */
    private String description;
}