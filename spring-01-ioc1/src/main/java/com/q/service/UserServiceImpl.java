package com.q.service;

//service���ʵ����
import com.q.dao.UserDao;
import com.q.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {

    //ע�⣬�����Ǻ���Ҫ��һ��˼��
    /*1.���Ǵ�ͳ�ķ���
        private UserDao userDao = new UserDaoImpl();
    */

    //2.��������Ҫ�õ����ĵط�,��ȥʵ����,��������һ���ӿ�,����set
    private UserDao userDao;
    // ����setʵ��
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public void getUser() {
        userDao.getUser();
    }
}
