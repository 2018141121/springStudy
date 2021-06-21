package com.q.Mapper;

import com.q.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserMapperImpl2
 * @Author С��
 * @Date 2021/3/3 14:42
 * ʵ���෽ʽ��  ��������spring��������jdbcTemplateģ��   �̳�SqlSessionDaoSupport�ࡿ
 **/
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {

    @Override
    public List<User> getUser() {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.getUser();
    }
}
