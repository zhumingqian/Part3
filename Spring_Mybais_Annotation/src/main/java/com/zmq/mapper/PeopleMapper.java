package com.zmq.mapper;

import com.zmq.entity.People;

import java.util.List;

/**
 * @author zmq
 * @date 2020/8/31
 * @since 1.8
 */
public interface PeopleMapper {
    List<People> queryPeopleList();

    int deleteInfoById(Integer id);
}
