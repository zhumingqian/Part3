package com.zmq.mapper.user;

import com.zmq.entity.User;

import java.util.List;

/**
 * @Author ZMQ
 * @Date 2020/9/2
 * @since 1.8
 */
public interface UserMapper {
    /**
     * 查询所有用户
     * @return
     */
    List<User> queryAllUser();

    /**
     * 添加用户信息
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 通过id查询用户信息
     * @param id
     * @return
     */
    User queryUserById(Integer id);

    /**
     * 通过id修改信息
     * @param user
     * @return
     */
    int updateUserInfoById(User user);

    /**
     * 通过id删除信息
     * @param id
     * @return
     */
    int deleteUserById(Integer id);
}
