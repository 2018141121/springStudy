package com.q.Mapper;

import com.q.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
import java.util.Map;

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
        //��������setһ��sqlSessionTemplate����Ϊ�̳е�Support���������ˣ�ֱ��ʹ��getSqlSession���
        //Ҳ����ģ�������ǵ�mapper���Ϳ���ִ����
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
