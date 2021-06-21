package com.q.pojo;

import org.springframework.stereotype.Component;

/**
 * @ClassName Dog
 * @Author 小林
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
        System.out.println("狗一");
    }

    public void show2() {
        System.out.println("狗注解自动装配");
    }
}
