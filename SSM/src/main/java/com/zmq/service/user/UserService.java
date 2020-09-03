package com.zmq.service.user;

import com.github.pagehelper.PageInfo;
import com.zmq.entity.User;

import java.util.List;

/**
 * @Author ZMQ
 * @Date 2020/9/2
 * @since 1.8
 */
public interface UserService {
    List<User> queryAllUser();

    /**
     * 分页查询信息
     * @param currentPage
     * @return
     */
    PageInfo<User> paginationQueryAllUser(String currentPage);
}
