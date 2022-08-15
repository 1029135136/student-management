package com.ang.student.common;

/**
 * @author: 于昂
 * @date: 2022/8/15
 **/
public enum ResCode {
    SUCCESS(200, "成功"),
    SYSTEM_ERROR(200, "系统内部错误"),
    ;


    private long code;
    private String message;


    ResCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
