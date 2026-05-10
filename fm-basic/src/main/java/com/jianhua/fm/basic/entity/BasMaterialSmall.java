package com.jianhua.fm.basic.entity;

import com.jianhua.fm.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 物料小类实体
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasMaterialSmall extends BaseEntity {

    /**
     * 物料小类编码
     */
    private String smallCode;

    /**
     * 物料小类名称
     */
    private String smallName;

    /**
     * 归属中类ID
     */
    private Long midId;

    /**
     * 备注
     */
    private String remark;
}