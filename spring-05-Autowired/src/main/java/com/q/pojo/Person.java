package com.q.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName Person
 * @Author 小林
 * @Date 2021/2/28 11:33
 **/

//这里是标注他是一个spring类
@Component
@Data
public class Person {
    @Autowired//自动装配
    private Cat cat;
    @Autowired
//    @Value("hou")
    private Dog dog;
//    @Value("linjinquan")
    private String name;

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setName(String name) {
        this.name = name;
    }
}
