package com.jianhua.fm.basic.entity;

import com.jianhua.fm.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 桩长实体
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasPileLen extends BaseEntity {

    /**
     * 桩长编码
     */
    private String pileLenCode;

    /**
     * 桩长名称
     */
    private String pileLenName;

    /**
     * 桩长值（米）
     */
    private java.math.BigDecimal pileLength;

    /**
     * 备注
     */
    private String remark;
}