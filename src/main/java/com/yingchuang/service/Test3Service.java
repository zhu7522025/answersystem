package com.yingchuang.service;

import com.github.pagehelper.PageInfo;
import com.yingchuang.entity.Test3;

/**
 * Created by Administrator on 2018/4/3.
 */
public interface Test3Service {
    //添加
    public int addTest3(Test3 test3);

    //根据ID修改状态
    public int updateStatus(Test3 test3);

    //根据ID修改等级
    public int updatePower(Test3 test3);

    //根据状态查询  //根据状态和等级查询
    public PageInfo<Test3> queryTest1ByStatus(Integer pageNum, Integer pageSize, Test3 test3);

    //根据ID查询
    public Test3 queryTest3ById(int id);



}
