package com.jianhua.fm.basic.entity;

import com.jianhua.fm.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 工厂实体
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasFactory extends BaseEntity {

    /**
     * 工厂编码
     */
    private String factoryCode;

    /**
     * 工厂名称
     */
    private String factoryName;

    /**
     * 工厂简称
     */
    private String factoryShortName;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 电话
     */
    private String phone;

    /**
     * 地址
     */
    private String address;

    /**
     * 备注
     */
    private String remark;
}