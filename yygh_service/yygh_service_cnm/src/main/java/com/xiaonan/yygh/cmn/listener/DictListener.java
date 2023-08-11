package com.xiaonan.yygh.cmn.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.xiaonan.yygh.cmn.mapper.DictMapper;
import com.xiaonan.yygh.model.cmn.Dict;
import com.xiaonan.yygh.vo.cmn.DictEeVo;
import org.springframework.beans.BeanUtils;

/**
 * DictListener
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/11 17:49
 * @say 山河总静好，人事也从容
 */
public class DictListener extends AnalysisEventListener<DictEeVo> {
    private DictMapper dictMapper;
    public DictListener(DictMapper dictMapper) {
        this.dictMapper = dictMapper;
    }

    //一行一行读取
    @Override
    public void invoke(DictEeVo dictEeVo, AnalysisContext analysisContext) {
        //调用方法添加数据库
        Dict dict = new Dict();
        BeanUtils.copyProperties(dictEeVo,dict);
        dictMapper.insert(dict);
    }
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}