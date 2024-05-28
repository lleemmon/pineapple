package com.pineapple.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Data
@EqualsAndHashCode(callSuper = false)
public class Problem implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Integer id;

    @Size(min = 1, max = 341)
    @TableField("content")
    private String content;

    @Min(1)
    @Max(2)
    @TableField("categorize")
    private Integer categorize;

    @Size(min = 1, max = 42)
    @TableField("answer")
    private String answer;
}
