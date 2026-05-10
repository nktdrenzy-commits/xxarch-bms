package com.jianhua.fm.common.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * 数据状态枚举
 */
@Getter
public enum DataStatus {

    CREATE(0, "创建"),
    SUBMIT(1, "提交"),
    AUDIT(2, "审核"),
    UNAUDIT(3, "反审核");

    @EnumValue
    @JsonValue
    private final Integer code;
    private final String desc;

    DataStatus(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}