package com.q.dao;

import com.q.service.StudentServiceImpl;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @ClassName StudentDaoImpl
 * @Author п║аж
 * @Date 2021/3/9 18:08
 **/
@Repository
public class StudentDaoImpl implements StudentDao {
    @Resource(name = "studentServiceImpl")
    private StudentServiceImpl studentService;

    @Override
    public void Add() {
        this.studentService.Add();
    }
}
