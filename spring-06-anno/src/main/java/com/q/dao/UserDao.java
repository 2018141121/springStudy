package com.q.dao;

import org.springframework.stereotype.Repository;

/**
 * @ClassName UserDao
 * @Author С��
 * @Date 2021/3/1 9:02
 **/

//���ݲ�ע�� ���Ͽ����˼
@Repository  //���� ���ݿ�ע��
public class UserDao {

    public void save() {
        System.out.println("userDao");
    }

}
