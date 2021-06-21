package com.q.Mapper;

import com.q.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @ClassName UserMapperImpl
 * @Author 小林
 * @Date 2021/3/3 13:36
 * 实现类方式一
 **/

public class UserMapperImpl implements UserMapper {
    //   sqlSessionTemplate不用我们去建立了，spring来管理，私有化sqlSessionTemplate，set一个sqlSessionTemplate
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
