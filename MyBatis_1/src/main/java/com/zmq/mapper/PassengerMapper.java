package com.zmq.mapper;

import com.zmq.entity.Employee;
import com.zmq.entity.Passenger;

import java.util.List;

/**
 * @Author ZMQ
 * @Date 2020/8/26
 * @since 1.8
 */
public interface PassengerMapper {
    /**
     * 通过id查询乘客
     * @param id
     * @return
     */
    Passenger queryPassengerById(Integer id);
}
