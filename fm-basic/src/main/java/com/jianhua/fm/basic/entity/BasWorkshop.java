package com.jianhua.fm.basic.entity;

import com.jianhua.fm.common.entity.BaseEntity;
import lombok.Data;
import com.jianhua.fm.common.entity.BaseEntity;
import lombok.EqualsAndHashCode;

/**
 * 车间实体
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasWorkshop extends BaseEntity {

    /**
     * 车间编码
     */
    private String workshopCode;

    /**
     * 车间名称
     */
    private String workshopName;

    /**
     * 所属工厂ID
     */
    private Long factoryId;

    /**
     * 备注
     */
    private String remark;
}