package com.jianhua.fm.system.entity;

import lombok.Data;
import com.jianhua.fm.common.entity.BaseEntity;
import lombok.EqualsAndHashCode;

/**
 * 组织实体
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysOrg extends BaseEntity {

    /**
     * 组织编码
     */
    private String orgCode;

    /**
     * 组织名称
     */
    private String orgName;

    /**
     * 组织类型：1集团 2工厂 3车间
     */
    private Integer orgType;

    /**
     * 上级组织ID
     */
    private Long parentId;

    /**
     * 排序
     */
    private Integer sortOrder;

    /**
     * 备注
     */
    private String remark;
}