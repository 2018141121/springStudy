package com.q.pojo;

public class User {

    private String name;

    //�вι�����
    public User(String name) {

        System.out.println("���ǵ������в����Ĺ��췽��");
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
        System.out.println("�в������name=" + this.name);
    }
}
