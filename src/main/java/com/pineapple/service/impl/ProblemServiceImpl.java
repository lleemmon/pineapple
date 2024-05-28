package com.pineapple.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pineapple.entity.Problem;
import com.pineapple.mapper.ProblemMapper;
import com.pineapple.service.ProblemService;
import org.springframework.stereotype.Service;

@Service
public class ProblemServiceImpl extends ServiceImpl<ProblemMapper, Problem> implements ProblemService {


}
