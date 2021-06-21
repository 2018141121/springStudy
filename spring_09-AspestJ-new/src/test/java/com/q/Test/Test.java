package com.q.Test;

import com.q.service.UserService01;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Test
 * @Author С��
 * @Date 2021/3/2 14:35
 **/
public class Test {
    @org.junit.Test
    public void test02() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
//        ������һ������bean��Ҫ�ҵ���Ŀ�����Ȼ����Ҫʵ�ֵ��ǽӿڣ���Ϊ�ǻ��ڽӿ�ʵ�ֵ�
        UserService01 annotationAspect = applicationContext.getBean("userService01Impl", UserService01.class);
        annotationAspect.add();
    }
}
