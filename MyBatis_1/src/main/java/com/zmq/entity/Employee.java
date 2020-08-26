package com.zmq.entity;

/**
 * @Author ZMQ
 * @Date 2020/8/26
 * @since 1.8
 * 员工实体类
 */
public class Employee {
    private Integer id;
    private String name;
    private Double salary;
    private int department_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }


    @Override
    public String toString() {
        return "EmployeeMapper{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department_id=" + department_id +
                '}';
    }
}
