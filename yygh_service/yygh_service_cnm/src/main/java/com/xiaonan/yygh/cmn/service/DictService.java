package com.xiaonan.yygh.cmn.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaonan.yygh.model.cmn.Dict;
import com.xiaonan.yygh.model.hosp.HospitalSet;

import java.util.List;

/**
 * HospitalSetService
 *
 * @author njy
 * @version 1.0
 * @description 医院设置接口service
 * @date 2023/7/21 17:12
 * @say 山河总静好，人事也从容
 */
public interface DictService extends IService<Dict>{

    //根据数据id查询子数据列表
    List<Dict> findChlidData(Long id);
}