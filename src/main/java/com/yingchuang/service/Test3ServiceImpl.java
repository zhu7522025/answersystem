package com.yingchuang.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yingchuang.dao.Test3Mapper;
import com.yingchuang.entity.Test3;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/4/3.
 */
@Service
public class Test3ServiceImpl implements Test3Service {
    @Resource
    private Test3Mapper test3Mapper;


    @Override
    public int addTest3(Test3 test3) {
        return test3Mapper.addTest3(test3);
    }

    @Override
    public int updateStatus(Test3 test3) {
        return test3Mapper.updateStatus(test3);
    }

    @Override
    public int updatePower(Test3 test3) {
        return test3Mapper.updatePower(test3);
    }

    @Override
    public PageInfo<Test3> queryTest1ByStatus(Integer pageNum, Integer pageSize, Test3 test3) {
        PageHelper.startPage(pageNum,pageSize);
        List<Test3> list=test3Mapper.queryTest3ByStatus(test3);
        return new PageInfo<>(list);
    }

    @Override
    public Test3 queryTest3ById(int id) {
        return test3Mapper.queryTest3ById(id);
    }
}
