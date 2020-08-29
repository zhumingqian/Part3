package com.zmq.entity;

import java.util.PrimitiveIterator;

/**
 * @author zmq
 * @date 2020/8/29
 * @since 1.8
 *
 * 测试信息实体类
 */
public class TestInfo {

    static {
        System.out.println("静态代码块...");
    }

    private String name;
    private String hobbys;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobbys() {
        return hobbys;
    }

    public void setHobbys(String hobbys) {
        this.hobbys = hobbys;
    }

    @Override
    public String toString() {
        return "TestInfo{" +
                "name='" + name + '\'' +
                ", hobbys='" + hobbys + '\'' +
                '}';
    }
}
