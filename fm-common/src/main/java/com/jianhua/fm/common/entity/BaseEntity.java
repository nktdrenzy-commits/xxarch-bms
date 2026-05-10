package com.jianhua.fm.common.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 通用实体基类
 * 所有业务表继承此类
 */
@Data
public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 组织ID（多租户隔离）
     */
    @TableField("org_id")
    private Long orgId;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 创建人ID
     */
    @TableField(fill = FieldFill.INSERT)
    private Long createBy;

    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    /**
     * 修改人ID
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updateBy;

    /**
     * 审核时间
     */
    private LocalDateTime auditTime;

    /**
     * 审核人ID
     */
    private Long auditBy;

    /**
     * 数据状态：0创建 1提交 2审核 3反审核
     */
    @TableField("data_status")
    private Integer dataStatus = 0;

    /**
     * 作废状态：0未作废 1作废
     */
    @TableField("void_status")
    private Integer voidStatus = 0;

    /**
     * 删除标记：0正常 1删除
     */
    @TableLogic
    @TableField("del_flag")
    private Integer delFlag = 0;
}