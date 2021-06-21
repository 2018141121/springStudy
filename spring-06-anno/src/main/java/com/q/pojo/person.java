package com.q.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName person
 * @Author 小林
 * @Date 2021/3/1 8:44
 **/


//组件 // 相当于配置文件中 <bean id="user" class="当前注解的类"/>

//公用类注解
// 相当于配置文件中 <bean id="user" class="当前注解的类"/>
@Component
public class person {

    //    public String name = "hello";   //属性注入1方式
    // 相当于配置文件中 <property name="name" value="hello2"/>
    @Value("hello2")
    public String name;              //属性注入2方式


    //属性注入3SET方式
//
//    public String name;
//
//    @Value("注解注入信息：名字name")
//    public void setName(String name) {
//        this.name = name;
//    }
}
