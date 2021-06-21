package com.q.Mapper;

import com.q.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;
import java.util.Map;

/**
 * @ClassName UserMapperImpl
 * @Author 小林
 * @Date 2021/3/3 13:36
 * @describe: [整合方式一]
 * 实现类方式一
 **/
public class UserMapperImpl implements UserMapper {
    //   sqlSessionTemplate不用我们去建立了，spring来管理，私有化sqlSessionTemplate，set一个sqlSessionTemplate
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<User> getUsers() {
//        User lin = new User(3, "lin", "1234");
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
//        mapper.addUser(lin);
//        mapper.deleteUser(3);
        return mapper.getUsers();
    }

    @Override
    public int addUser(Map<String, Object> map) {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
//        HashMap<String, Object> map = new HashMap<>();
        map.put("id", 40);
        map.put("name", "linjinquan");
        map.put("pwd", 234);
        return mapper.addUser(map);

    }

    @Override
    public int deleteUser(int id) {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.deleteUser(id);
    }
}

