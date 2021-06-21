package com.q.Mapper;

import com.q.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserMapperImpl2
 * @Author 小林
 * @Date 2021/3/3 14:42
 * 实现类方式二  【不用在spring里面配置jdbcTemplate模板   继承SqlSessionDaoSupport类】
 **/
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {

    @Override
    public List<User> getUser() {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.getUser();
    }
}
