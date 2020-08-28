package com.zmq.mapper;

import com.zmq.entity.Department;
import com.zmq.entity.Employee;

import java.util.List;

/**
 * @Author ZMQ
 * @Date 2020/8/26
 * @since 1.8
 */
public interface DepartmentMapper {

    /**
     * 通过部门id查询员工    关系一对多关系
     * @param id
     * @return
     */

    Department queryEmployeeByDepartmentId(Integer id);


    Department queryDepartmentByDid(Integer id);
}
