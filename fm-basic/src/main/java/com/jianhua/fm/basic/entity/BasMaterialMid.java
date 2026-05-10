package com.jianhua.fm.basic.entity;

import com.jianhua.fm.common.entity.BaseEntity;
import lombok.Data;
import com.jianhua.fm.common.entity.BaseEntity;
import lombok.EqualsAndHashCode;

/**
 * 物料中类实体
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasMaterialMid extends BaseEntity {

    /**
     * 物料中类编码
     */
    private String midCode;

    /**
     * 物料中类名称
     */
    private String midName;

    /**
     * 归属大类ID
     */
    private Long bigId;

    /**
     * 备注
     */
    private String remark;
}