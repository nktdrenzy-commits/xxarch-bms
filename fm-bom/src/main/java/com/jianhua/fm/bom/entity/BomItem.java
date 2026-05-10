package com.jianhua.fm.bom.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * BOM子项物料（表体）
 */
@Data
@TableName("bom_item")
public class BomItem {

    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 关联BOM主表ID
     */
    private Long bomId;

    /**
     * 组织ID
     */
    private Long orgId;

    /**
     * 子项物料ID
     */
    private Long subMaterialId;

    /**
     * 关联BOM（虚拟件必填）
     */
    private Long relatedBomId;

    /**
     * 是否影响圈长：0否 1是
     */
    private Integer isAffectCoilLen;

    /**
     * 下料长度
     */
    private BigDecimal cutLength;

    /**
     * 根/个数
     */
    private BigDecimal countNum;

    /**
     * 单位
     */
    private String unit;

    /**
     * 数量（计算结果/手填）
     */
    private BigDecimal quantity;

    /**
     * 排序
     */
    private Integer sortOrder = 0;
}