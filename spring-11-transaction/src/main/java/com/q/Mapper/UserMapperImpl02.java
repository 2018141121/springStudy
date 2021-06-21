package com.q.Mapper;

import com.q.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
import java.util.Map;

/**
 * @ClassName UserMapperImpl02
 * @Author 小林
 * @Date 2021/3/13 14:37
 * @describe: [整合方式二]
 **/

//继承Support类 , 直接利用 getSqlSession() 获得 , 然后直接注入SqlSessionFactory
public class UserMapperImpl02 extends SqlSessionDaoSupport implements UserMapper {

    @Override
    public List<User> getUsers() {
        //不用我们set一个sqlSessionTemplate，因为继承的Support类里面有了，直接使用getSqlSession获得
        //也就是模板获得我们的mapper，就可以执行了
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.getUsers();
    }

    @Override
    public int addUser(Map<String, Object> map) {
        return 0;
    }

    @Override
    public int deleteUser(int id) {
        return 0;
    }
}
