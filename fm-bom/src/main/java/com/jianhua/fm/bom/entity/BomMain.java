package com.jianhua.fm.bom.entity;

import com.jianhua.fm.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * BOM主表
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BomMain extends BaseEntity {

    /**
     * BOM编码
     */
    private String bomCode;

    /**
     * BOM名称（不允许重复）
     */
    private String bomName;

    /**
     * BOM类型：1产成品BOM 2自制半成品BOM 3混凝土BOM
     */
    private Integer bomType;

    /**
     * 父项物料ID
     */
    private Long parentMaterialId;

    /**
     * 生产车间ID
     */
    private Long workshopId;

    /**
     * 桩长ID（产成品BOM）
     */
    private Long pileLenId;

    /**
     * 生效日期
     */
    private LocalDate effectiveDate;

    /**
     * 失效日期
     */
    private LocalDate expireDate;

    /**
     * 桩件类型：1圆桩 2实心方桩 3空心方桩 4异形桩 5非桩件
     */
    private Integer pileType;

    /**
     * 养护方式（混凝土BOM）
     */
    private Long cureMethodId;

    /**
     * 强度等级（产成品BOM）
     */
    private Long strengthLevelId;

    /**
     * 是否用余浆：0否 1是
     */
    private Integer isUseSurplusSlurry;

    // ==== 混凝土BOM参数 ====
    /**
     * 体积（异形桩/非桩件）
     */
    private BigDecimal volume;

    /**
     * 加密区长度
     */
    private BigDecimal encryptedLen;

    /**
     * 外加直径（自动汇总）
     */
    private BigDecimal extraDiameter;

    /**
     * 砂率（混凝土BOM）
     */
    private BigDecimal sandRatio;

    /**
     * 减水剂掺量
     */
    private BigDecimal waterReducerDosage;

    /**
     * 减水剂含固量
     */
    private BigDecimal waterReducerSolid;

    /**
     * 水胶比
     */
    private BigDecimal waterBinderRatio;

    /**
     * 胶凝材料占比
     */
    private BigDecimal cementitiousRatio;

    /**
     * 砂含水率
     */
    private BigDecimal sandMoisture;

    /**
     * 石含水率
     */
    private BigDecimal stoneMoisture;

    // ==== 通用字段 ====
    /**
     * 锁定状态：0未锁定 1锁定
     */
    private Integer locked = 0;
}