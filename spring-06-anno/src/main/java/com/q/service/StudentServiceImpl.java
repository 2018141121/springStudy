package com.q.service;

import com.q.controller.StudentController;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName StudentServiceImpl
 * @Author п║аж
 * @Date 2021/3/9 17:08
 **/
@Service
public class StudentServiceImpl implements StudentService {
    @Resource(name = "studentController")
    private StudentController studentController;

    @Override
    public void Add() {
        this.studentController.Add();
    }
}
