package com.pineapple.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pineapple.common.result.Result;
import com.pineapple.entity.Problem;
import com.pineapple.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/problem")
public class ProblemController {
    @Autowired
    private ProblemService problemService;

    @GetMapping("/get/{id}")
    public Result<Problem> get(@PathVariable Integer id){
        return Result.ok(problemService.getById(id));
    }

    @PostMapping("/page")
    public Result<Page<Problem>> page(){
        Page<Problem> problemPage = new Page<>(1, 10);
        LambdaQueryWrapper<Problem>wrapper = new LambdaQueryWrapper<>();
        return Result.ok(problemService.page(problemPage, wrapper));
    }
}
