package com.q.pojo;

import lombok.Data;

/**
 * @ClassName person
 * @Author п║аж
 * @Date 2021/2/27 0:23
 **/

public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
