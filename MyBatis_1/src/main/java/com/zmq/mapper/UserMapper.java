package com.zmq.mapper;

import com.zmq.entity.User;

import java.util.Map;

/**
 * @Author ZMQ
 * @Date 2020/8/25
 * @since 1.8
 */
public interface UserMapper {
    User selectUserById(Integer id);

    User selectUserByIdAndAge(Integer id,Integer age);

    User selectUserByLikeName(String name);

    User selectUserByMap(Map map);

    int addUser(User user);

    int updateUserById(User user);

    int deleteUserById(Integer id);

    int addAfterGetId(User user);
}
