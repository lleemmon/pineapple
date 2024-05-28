package com.pineapple.common.result;

import lombok.Getter;

@Getter
public enum ResultCodeEnum {
    SUCCESS(200, "成功"),
    FAIL(503, "失败");

    private Integer code;
    private String message;
    ResultCodeEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }
}
