package com.q.pojo;

public class User2 {

    private String name;

    //无参构造器
    public User2() {
        System.out.println("user2被创建");
        System.out.println("无参数构造就要有set方法才可以注入值");
    }

    public void setName(String name) {
        this.name = name;
    }
    public void showName(){
        System.out.println("注入的值："+this.name);
    }
}
