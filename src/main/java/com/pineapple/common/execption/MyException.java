package com.pineapple.common.execption;

import com.pineapple.common.result.ResultCodeEnum;
import lombok.Data;

@Data
public class MyException extends RuntimeException {

    private Integer code;//状态码
    private String msg;//描述信息

    public MyException(Integer code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public MyException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
        this.msg = resultCodeEnum.getMessage();
    }

    @Override
    public String toString() {
        return "GuliException{" +
                "code=" + code +
                ", message=" + this.getMessage() +
                '}';
    }
}
