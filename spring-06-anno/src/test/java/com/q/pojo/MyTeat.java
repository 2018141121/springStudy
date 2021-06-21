package com.q.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName MyTeat
 * @Author п║аж
 * @Date 2021/3/1 8:51
 **/
public class MyTeat {
    @Test
    public void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        person person = applicationContext.getBean("person", person.class);
        System.out.println(person);
        System.out.println(person.name);

    }
}
