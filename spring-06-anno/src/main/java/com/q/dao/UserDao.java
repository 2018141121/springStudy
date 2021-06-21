package com.q.dao;

import org.springframework.stereotype.Repository;

/**
 * @ClassName UserDao
 * @Author 小林
 * @Date 2021/3/1 9:02
 **/

//数据层注解 资料库的意思
@Repository  //资料 数据库注解
public class UserDao {

    public void save() {
        System.out.println("userDao");
    }

}
