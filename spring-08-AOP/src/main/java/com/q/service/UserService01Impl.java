package com.q.service;

/**
 * @ClassName UserServiceImpl
 * @Author С��
 * @Date 2021/3/1 22:36
 **/

//�ڶ�����дʵ����
public class UserService01Impl implements UserService01 {
    @Override
    public void add() {
        System.out.println("adduser");
    }

    @Override
    public void delete() {
        System.out.println("deleteUser");
    }

    @Override
    public void update() {
        System.out.println("updateUser");
    }

    @Override
    public void query() {
        System.out.println("queryUser");
    }
}
