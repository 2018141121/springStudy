package com.q.service;

import com.q.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test() {

        //�õ�����
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //�õ��������Ϳ������get�ˣ�����Ҷ���
        UserServiceImpl myBean2 = (UserServiceImpl) applicationContext.getBean("myBean2");
        myBean2.getUser();
    }

}
