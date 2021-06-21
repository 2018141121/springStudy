package com.q.demo03;

/**
 * @ClassName UserDaoImpl
 * @Author 小林
 * @Date 2021/3/1 21:07
 **/
public class UserDaoImpl implements UserDao {

    @Override
    public void adduser() {
        System.out.println("增加");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除");
    }
}
