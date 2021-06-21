package com.q.controller;

import com.q.service.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @ClassName UseController
 * @Author С��
 * @Date 2021/3/1 9:03
 **/

@Controller  //������ע��
public class UseController {
    @Resource(name = "userService")
    private UserService userService;

    public void save() {
        this.userService.save();
        System.out.println("userController");

    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
