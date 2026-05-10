package com.jianhua.fm.common.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 角色实体
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysRole extends BaseEntity {

    /**
     * 角色编码
     */
    private String roleCode;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色类型：1超级管理员 2组织管理员 3普通角色
     */
    private Integer roleType;

    /**
     * 排序
     */
    private Integer sortOrder;

    /**
     * 状态：0正常 1禁用
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;
}