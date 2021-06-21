package com.q.service;

import com.q.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName UserService
 * @Author С��
 * @Date 2021/3/1 9:07
 **/


@Service //������ע��
public class UserService {

    @Value("ע��ע����Ϣ���֣�hello service")
    public String name;
    @Resource(name = "userDao")
    private UserDao userDao;

    public void save(){
        this.userDao.save();
        System.out.println("userService���");
    }




}
