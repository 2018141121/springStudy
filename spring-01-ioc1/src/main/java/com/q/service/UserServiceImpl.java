package com.q.service;

//service层的实现类
import com.q.dao.UserDao;
import com.q.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {

    //注意，这里是很重要的一种思想
    /*1.这是传统的方法
        private UserDao userDao = new UserDaoImpl();
    */

    //2.可以在需要用到他的地方,不去实现它,而是留出一个接口,利用set
    private UserDao userDao;
    // 利用set实现
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public void getUser() {
        userDao.getUser();
    }
}
