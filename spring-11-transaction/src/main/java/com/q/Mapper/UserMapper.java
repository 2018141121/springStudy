package com.q.Mapper;

import com.q.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

import java.util.List;
import java.util.Map;

/**
 * @ClassName UserMapper
 * @Author С��
 * @Date 2021/3/2 22:54
 **/
public interface UserMapper {
    List<User> getUsers();

    //ʹ��ע��
    //����û�
    @Insert("insert into  user(id,name,pwd) values (#{id},#{name},#{pwd})")
    int addUser(Map<String, Object> map);

    //ɾ���û�
    @Delete("delete from user where id =#{id} ")
    int deleteUser(int id);

}
