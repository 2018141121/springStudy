package com.q.pojo;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){

        //获取spring上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们对象都在spring中管理了，现在只需要去spring中取出来就可以了
        Hello hello = (Hello) context.getBean("hello");
        String s = hello.toString();
        System.out.println(s);

    }

}
