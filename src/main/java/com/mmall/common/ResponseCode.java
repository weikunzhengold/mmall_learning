package com.mmall.common;

/**
 * <p></p>
 *
 * @author 郑伟坤 (weikun.zheng@ucarinc.com)
 * @version 1.0
 * @data 2020/1/16  15:07
 */
public enum  ResponseCode {
    SUCCESS(0, "SUCCESS"),
    ERROR(1, "ERROR"),
    NEED_LOGIN(10, "NEED_LOGIN"),
    ILLEGAL_ARGUMENT(2, "ILLEGAL_ARGUMENT");

    private final int code;
    private final String msg;

    ResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
