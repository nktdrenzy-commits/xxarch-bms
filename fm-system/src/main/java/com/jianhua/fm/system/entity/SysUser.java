package com.jianhua.fm.system.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户实体
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysUser extends BaseEntity {

    /**
     * 用户账号
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户姓名
     */
    private String realName;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 组织ID
     */
    private Long orgId;

    /**
     * 当前选择组织ID（用于切换组织）
     */
    private Long currentOrgId;

    /**
     * 状态：0正常 1禁用
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;
}