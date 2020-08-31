package com.zmq.service.impl;

import com.zmq.entity.People;
import com.zmq.mapper.PeopleMapper;
import com.zmq.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zmq
 * @date 2020/8/31
 * @since 1.8
 * 使用注解注入对象
 */
@Service
public class PeopleServiceImpl implements PeopleService {
    @Autowired
    private PeopleMapper pm;

    @Override
    public List<People> queryPeopleList() {
        return pm.queryPeopleList();
    }

    @Override
    public int deleteInfoById(Integer id) {
        int res = pm.deleteInfoById(id);
        int i = 2 / 0;
        return res;
    }
}
