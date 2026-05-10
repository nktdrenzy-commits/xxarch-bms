package com.jianhua.fm.common.enums;

/**
 * 统一响应码
 */
public class ResultCode {

    public static final int SUCCESS = 200;
    public static final int FAIL = 500;

    // 客户端错误 4xx
    public static final int BAD_REQUEST = 400;
    public static final int UNAUTHORIZED = 401;
    public static final int FORBIDDEN = 403;
    public static final int NOT_FOUND = 404;

    // 业务错误 10xxx
    public static final int DATA_STATUS_ERROR = 10001;
    public static final int DATA_REFERENCE_ERROR = 10002;
    public static final int CIRCULAR_REFERENCE_ERROR = 10003;
    public static final int SYNC_ERROR = 10004;
    public static final int VALIDATION_ERROR = 10005;
}