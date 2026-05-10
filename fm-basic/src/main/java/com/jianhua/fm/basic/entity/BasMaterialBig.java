package com.jianhua.fm.basic.entity;

import com.jianhua.fm.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 物料大类实体
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasMaterialBig extends BaseEntity {

    /**
     * 物料大类编码
     */
    private String bigCode;

    /**
     * 物料大类名称
     */
    private String bigName;

    /**
     * 备注
     */
    private String remark;
}