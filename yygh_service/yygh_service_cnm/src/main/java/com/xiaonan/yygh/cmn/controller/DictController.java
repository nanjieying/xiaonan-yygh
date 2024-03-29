package com.xiaonan.yygh.cmn.controller;

import com.xiaonan.yygh.cmn.service.DictService;
import com.xiaonan.yygh.common.result.Result;
import com.xiaonan.yygh.model.cmn.Dict;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * DictController
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/11 15:25
 * @say 山河总静好，人事也从容
 */
@Api(tags = "字典管理")
@RestController
@RequestMapping("/admin/cmn/dict")
public class DictController {

    @Autowired
    private DictService dictService;

    //根据数据id查询子数据列表
    @ApiOperation(value = "根据数据id查询子数据列表")
    @GetMapping("findChildData/{id}")
    public Result findChildData(@PathVariable Long id) {
        List<Dict> list = dictService.findChlidData(id);
        return Result.ok(list);
    }

    //导出数据字典的接口
    @GetMapping
    public Result exportDict(HttpServletResponse response){
        dictService.exportDictData(response);
        return Result.ok();
    }

    @ApiOperation(value = "导入")
    @PostMapping("importData")
    public Result importData(MultipartFile file) {
        dictService.importDictData(file);
        return Result.ok();
    }

}