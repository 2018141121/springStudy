package com.q.service;

import com.q.controller.StudentController;
import com.q.dao.StudentDao;
import com.q.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName MyTest
 * @Author п║аж
 * @Date 2021/3/1 9:32
 **/
public class MyTest01 {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = applicationContext.getBean("student", Student.class);
        student.setName("lin");
        student.setAge(20);
        student.setId(1);
        StudentController studentController = applicationContext.getBean("studentController", StudentController.class);
        studentController.Add();
    }
}

