package com.jianhua.fm.altlist.entity;

import com.jianhua.fm.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = true)
public class AltMaterialList extends BaseEntity {
    private String listCode;
    private String listName;
    private Integer listType;
    private Long sourceBomId;
    private Long cureMethodId;
    private Long strengthLevelId;
    private Integer isUseSurplusSlurry;
    private LocalDate effectiveDate;
    private LocalDate expireDate;
    private Integer isSynced;
}
