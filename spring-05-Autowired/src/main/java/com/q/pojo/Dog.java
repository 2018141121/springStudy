package com.q.pojo;

import org.springframework.stereotype.Component;

/**
 * @ClassName Dog
 * @Author С��
 * @Date 2021/2/28 11:32
 **/
//@Component
public class Dog {
    private String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    public void show() {
        System.out.println("��һ");
    }

    public void show2() {
        System.out.println("��ע���Զ�װ��");
    }
}
