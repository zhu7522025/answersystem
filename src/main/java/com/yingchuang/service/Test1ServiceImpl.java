package com.yingchuang.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yingchuang.dao.Test1Mapper;
import com.yingchuang.entity.Test1;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/4/3.
 */
@Service
public class Test1ServiceImpl implements Test1Service {
    @Resource
    private Test1Mapper test1Mapper;

    @Override
    public int addTest1(Test1 test1) {
        return test1Mapper.addTest1(test1);
    }

    @Override
    public int updateStatus(Test1 test1) {
        return test1Mapper.updateStatus(test1);
    }

    @Override
    public int updatePower(Test1 test1) {
        return test1Mapper.updatePower(test1);
    }

    @Override
    public PageInfo<Test1> queryTest1ByStatus(Integer pageNum,Integer pageSize,Test1 test1) {
        PageHelper.startPage(pageNum,pageSize);
        List<Test1> list=test1Mapper.queryTest1ByStatus(test1);
        return new PageInfo<>(list);
    }

    @Override
    public Test1 queryTest1ById(int id) {
        return test1Mapper.queryTest1ById(id);
    }
}
