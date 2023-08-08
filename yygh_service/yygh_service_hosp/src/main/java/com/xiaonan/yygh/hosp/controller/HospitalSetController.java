package com.xiaonan.yygh.hosp.controller;

import com.xiaonan.yygh.hosp.service.HospitalSetService;
import com.xiaonan.yygh.model.hosp.HospitalSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * HospitalSetController
 *
 * @author njy
 * @version 1.0
 * @description 控制器
 * @date 2023/7/21 17:34
 * @say 山河总静好，人事也从容
 */
@RestController
@RequestMapping("/admin/hosp/hospitalSet")
public class HospitalSetController {
    @Autowired
    private HospitalSetService hospitalSetService;

    //1 查询医院设置表所有信息
    @GetMapping("findAll")
    public List<HospitalSet> findAllHospitalSet() {
        //调用service的方法
        List<HospitalSet> list = hospitalSetService.list();
        return list;
    }
}