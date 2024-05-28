package com.pineapple.common.myEnum;

import lombok.Getter;

@Getter
public enum ProblemTypeEnum {
    CHOOSE("选择题", 1),
    BLANK("填空题", 2);

    private final String name;
    private final Integer code;

    ProblemTypeEnum(String name, Integer code){
        this.name = name;
        this.code = code;
    }
}
