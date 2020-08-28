package com.zmq.mapper;

import com.zmq.entity.User;

import java.util.List;
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

    /***动态SQL**/
    User selectUserById1(Integer id);

    List<User> selectUserById2(User user);

    int selectUserById3(User user);

    List<User> selectUserById4(User user);

    List<User> selectUserById5(List<Integer> id);

    List<User> queryAllUser();
}
