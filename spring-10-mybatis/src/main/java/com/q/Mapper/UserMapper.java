package com.q.Mapper;

import com.q.pojo.User;

import java.util.List;


public interface UserMapper {
    /**
     * 获取用户
     *
     * @return {@link List<User>}
     */
    List<User> getUser();


}
