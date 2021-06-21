package com.q.service;

import com.q.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName UserService
 * @Author 小林
 * @Date 2021/3/1 9:07
 **/


@Service //服务类注解
public class UserService {

    @Value("注解注入信息名字：hello service")
    public String name;
    @Resource(name = "userDao")
    private UserDao userDao;

    public void save(){
        this.userDao.save();
        System.out.println("userService输出");
    }




}
