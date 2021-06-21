package com.q.dao;


//这个类也是实现UserDao接口
public class UserMysqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("mysql输出数据");
    }
}
