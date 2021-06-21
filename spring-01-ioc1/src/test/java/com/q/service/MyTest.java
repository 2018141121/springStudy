package com.q.service;

import com.q.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test() {

        //拿到容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //拿到容器，就可以随便get了，随便找对象
        UserServiceImpl myBean2 = (UserServiceImpl) applicationContext.getBean("myBean2");
        myBean2.getUser();
    }

}
