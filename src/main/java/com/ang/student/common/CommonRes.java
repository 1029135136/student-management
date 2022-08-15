package com.ang.student.common;

import lombok.Data;

/**
 * @author: 于昂
 * @date: 2022/8/15
 **/

@Data
public class CommonRes<T> {
    private long code;
    private T body;
    private String errorMessage;

    private CommonRes() {
    }

    public CommonRes(ResCode code, T body) {
        this.code = code.getCode();
        this.body = body;
    }

    public CommonRes(ResCode code, T body, String errorMessage) {
        this.code = code.getCode();
        this.body = body;
        this.errorMessage = errorMessage;
    }

    public static <T> CommonRes success(T t) {
        return new CommonRes(ResCode.SUCCESS, t);
    }

    public static CommonRes fail(String errorMessage) {
        return new CommonRes(ResCode.SYSTEM_ERROR, null, errorMessage);
    }

    public static CommonRes fail() {
        return fail("系统内部错误");
    }

}
