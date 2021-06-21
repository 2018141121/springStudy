package com.q.controller;

import com.q.pojo.Student;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @ClassName StudentController
 * @Author п║аж
 * @Date 2021/3/9 17:08
 **/
@Controller
public class StudentController {
    @Resource(name = "student")
    private Student student;

    public void Add() {
        System.out.println(this.student.toString());
    }
}
