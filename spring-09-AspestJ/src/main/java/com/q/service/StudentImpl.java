package com.q.service;

/**
 * @ClassName StudentImpl
 * @Author 小林
 * @Date 2021/3/2 15:42
 **/
public class StudentImpl implements Student {

    @Override
    public void say() {
        System.out.println("说话的方法");
    }

    @Override
    public void buy() {
        System.out.println("买东西的方法");
    }
}
