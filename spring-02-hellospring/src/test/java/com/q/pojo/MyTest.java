package com.q.pojo;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){

        //��ȡspring�����Ķ���
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //���Ƕ�����spring�й����ˣ�����ֻ��Ҫȥspring��ȡ�����Ϳ�����
        Hello hello = (Hello) context.getBean("hello");
        String s = hello.toString();
        System.out.println(s);

    }

}
