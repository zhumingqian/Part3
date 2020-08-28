package com.zmq.mapper;

import com.zmq.entity.Employee;

/**
 * @author zmq
 * @date 2020/8/28
 * @since 1.8
 */
public interface EmployeeMapper {
    Employee queryEmployee(Integer id);
}
