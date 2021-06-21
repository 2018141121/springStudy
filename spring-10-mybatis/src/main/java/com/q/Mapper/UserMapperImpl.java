package com.q.Mapper;

import com.q.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @ClassName UserMapperImpl
 * @Author С��
 * @Date 2021/3/3 13:36
 * ʵ���෽ʽһ
 **/

public class UserMapperImpl implements UserMapper {
    //   sqlSessionTemplate��������ȥ�����ˣ�spring������˽�л�sqlSessionTemplate��setһ��sqlSessionTemplate
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<User> getUser() {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.getUser();
    }
}
