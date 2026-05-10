package com.jianhua.fm.basic.entity;

import com.jianhua.fm.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * 物料实体（主表）
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasMaterial extends BaseEntity {

    /**
     * 物料编码
     */
    private String materialCode;

    /**
     * 物料名称
     */
    private String materialName;

    /**
     * 归属大类ID
     */
    private Long bigId;

    /**
     * 归属中类ID
     */
    private Long midId;

    /**
     * 归属小类ID
     */
    private Long smallId;

    /**
     * 物料类型：1原材料 2半成品 3产成品
     */
    private Integer materialType;

    /**
     * 单位
     */
    private String unit;

    /**
     * 规格
     */
    private String specification;

    /**
     * 型号
     */
    private String model;

    /**
     * 密度（钢材计算用）
     */
    private BigDecimal density;

    /**
     * 状态：0正常 1禁用
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;
}