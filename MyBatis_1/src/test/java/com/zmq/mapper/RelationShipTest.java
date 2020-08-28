package com.zmq.mapper;

import com.zmq.entity.Department;
import com.zmq.entity.Employee;
import com.zmq.entity.Passenger;
import com.zmq.tools.MyBatisUtils;
import org.junit.Test;

import java.util.List;

/**
 * @Author ZMQ
 * @Date 2020/8/26
 * @since 1.8
 *
 * 一方，添加集合；多方，添加对象。
 *
 * 双方均可建立关系属性，建立关系属性后，对应的Mapper文件中需使用< ResultMap >完成多表映射。
 *
 * 持有对象关系属性，使用< association property="dept" javaType="department" >
 *
 * 持有集合关系属性，使用< collection property="emps" ofType="employee" >
 */
public class RelationShipTest {
    /**
     * 一对一关系查询
     */
    @Test
    public void testOneToOneRelation(){
        PassengerMapper passengerMapper = MyBatisUtils.getProxyObj(PassengerMapper.class);
        Passenger passenger = passengerMapper.queryPassengerById(1001);
        System.out.println(passenger);
    }

    /**
     * 一对多关系查询    部门对员工   一对多
     */
    @Test
    public void queryEmployee(){
        DepartmentMapper departmentMapper = MyBatisUtils.getProxyObj(DepartmentMapper.class);
        Department department = departmentMapper.queryEmployeeByDepartmentId(1);
        System.out.println(department);
    }

    /**
     * 查询多对多关系    通过第三张表建立连接   通过中间表查询
     */
    @Test
    public void queryStudent(){

    }


    @Test
    public void testQueryDepartment(){
        DepartmentMapper departmentMapper = MyBatisUtils.getProxyObj(DepartmentMapper.class);
        Department department = departmentMapper.queryDepartmentByDid(1);
        System.out.println(department);
    }

}
