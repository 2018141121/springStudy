package com.q.Mapper;

import com.q.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @ClassName UserMapperImpl02
 * @Author С��
 * @Date 2021/3/13 14:37
 * @describe: [���Ϸ�ʽ��]
 **/

//�̳�Support�� , ֱ������ getSqlSession() ��� , Ȼ��ֱ��ע��SqlSessionFactory
public class UserMapperImpl02 extends SqlSessionDaoSupport implements UserMapper {


    @Override
    public List<User> getUsers() {
        User lin = new User(4, "lin", "23453523");

        //��������setһ��sqlSessionTemplate����Ϊ�̳е�Support���������ˣ�ֱ��ʹ��getSqlSession���
        //Ҳ����ģ�������ǵ�mapper���Ϳ���ִ����
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);

        mapper.addUser(lin);
        mapper.deleteUser(3);
        return mapper.getUsers();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(1);
    }
}
