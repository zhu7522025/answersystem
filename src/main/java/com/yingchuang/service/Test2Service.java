package com.yingchuang.service;

import com.github.pagehelper.PageInfo;
import com.yingchuang.entity.Test2;

/**
 * Created by Administrator on 2018/4/3.
 */
public interface Test2Service {
    //添加
    public int addTest2(Test2 test2);

    //根据ID修改状态
    public int updateStatus(Test2 test2);

    //根据ID修改等级
    public int updatePower(Test2 test2);

    //根据状态查询  //根据状态和等级查询
    public PageInfo<Test2> queryTest1ByStatus(Integer pageNum, Integer pageSize, Test2 test2);

    //根据ID查询
    public Test2 queryTest2ById(int id);

}
