package com.q.Mapper;

import com.q.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;
import java.util.Map;

/**
 * @ClassName UserMapperImpl
 * @Author С��
 * @Date 2021/3/3 13:36
 * @describe: [���Ϸ�ʽһ]
 * ʵ���෽ʽһ
 **/
public class UserMapperImpl implements UserMapper {
    //   sqlSessionTemplate��������ȥ�����ˣ�spring������˽�л�sqlSessionTemplate��setһ��sqlSessionTemplate
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

