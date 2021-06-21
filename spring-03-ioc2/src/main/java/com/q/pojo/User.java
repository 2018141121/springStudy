package com.q.pojo;

public class User {

    private String name;

    //有参构造器
    public User(String name) {

        System.out.println("这是调用了有参数的构造方法");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public void showName() {
        System.out.println("有参数输出name=" + this.name);
    }
}
