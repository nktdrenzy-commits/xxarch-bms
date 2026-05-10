package com.jianhua.fm.basic.entity;

import com.jianhua.fm.common.entity.BaseEntity;
import lombok.Data;
import com.jianhua.fm.common.entity.BaseEntity;
import lombok.EqualsAndHashCode;

/**
 * 养护方式实体
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasCureMethod extends BaseEntity {

    /**
     * 养护方式编码
     */
    private String cureCode;

    /**
     * 养护方式名称
     */
    private String cureName;

    /**
     * 备注
     */
    private String remark;
}