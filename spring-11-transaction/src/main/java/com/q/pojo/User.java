package com.q.pojo;

import lombok.Data;

@Data

public class User {

    private long id;
    private String name;
    private String pwd;

    public User(long id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public User() {
    }
}
