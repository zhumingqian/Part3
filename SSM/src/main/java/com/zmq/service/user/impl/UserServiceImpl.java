package com.zmq.service.user.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zmq.entity.User;
import com.zmq.mapper.user.UserMapper;
import com.zmq.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author ZMQ
 * @Date 2020/9/2
 * @since 1.8
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryAllUser() {
        return userMapper.queryAllUser();
    }

    /**
     * 分页查询信息
     * @param currentPage
     * @return
     */
    @Override
    public PageInfo<User> paginationQueryAllUser(String currentPage) {
        //设置分页信息
        int curPage = 1;
        int pageSize = 5;
        if(currentPage != null){
            curPage = Integer.parseInt(currentPage);
        }
        //设置分页
        PageHelper.startPage(curPage,pageSize);
        //查询信息
        List<User> userList = userMapper.queryAllUser();
        //将查询结果放到pageInfo中
        PageInfo<User> pageInfo = new PageInfo<>(userList);
        return pageInfo;
    }
}
