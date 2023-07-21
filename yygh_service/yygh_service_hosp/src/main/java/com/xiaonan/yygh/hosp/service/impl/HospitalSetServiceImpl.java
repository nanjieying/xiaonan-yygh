package com.xiaonan.yygh.hosp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaonan.yygh.hosp.mapper.HospitalSetMapper;
import com.xiaonan.yygh.hosp.service.HospitalSetService;
import com.xiaonan.yygh.model.hosp.HospitalSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * HospitalSetServiceImpl
 *
 * @author njy
 * @version 1.0
 * @description 实现类
 * @date 2023/7/21 17:26
 * @say 山河总静好，人事也从容
 */
@Service
public class HospitalSetServiceImpl extends ServiceImpl<HospitalSetMapper, HospitalSet> implements HospitalSetService {
    @Autowired
    private HospitalSetMapper hospitalSetMapper;

}