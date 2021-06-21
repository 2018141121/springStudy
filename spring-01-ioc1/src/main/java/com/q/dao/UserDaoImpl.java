package com.q.dao;

//第二步：实现接口  也就是具体的实现
//Dao层的实现
public class UserDaoImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("得到用户数据！");
    }
}
