package com.q.pojo;

public class User2 {

    private String name;

    //�޲ι�����
    public User2() {
        System.out.println("user2������");
        System.out.println("�޲��������Ҫ��set�����ſ���ע��ֵ");
    }

    public void setName(String name) {
        this.name = name;
    }
    public void showName(){
        System.out.println("ע���ֵ��"+this.name);
    }
}
