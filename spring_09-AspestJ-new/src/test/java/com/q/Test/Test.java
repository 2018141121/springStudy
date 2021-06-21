package com.q.Test;

import com.q.service.UserService01;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Test
 * @Author 小林
 * @Date 2021/3/2 14:35
 **/
public class Test {
    @org.junit.Test
    public void test02() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
//        这里找一个对象bean需要找的是目标对象，然后需要实现的是接口，因为是基于接口实现的
        UserService01 annotationAspect = applicationContext.getBean("userService01Impl", UserService01.class);
        annotationAspect.add();
    }
}
