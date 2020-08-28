package com.zmq.tools;

import org.springframework.beans.factory.FactoryBean;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author zmq
 * @date 2020/8/28
 * @since 1.8
 *
 * 复杂对象注入
 *
 */
public class MyFactoryBean implements FactoryBean {
    /**
     * 获得对象
     * @return
     * @throws Exception
     */
    @Override
    public Object getObject() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///mybatis?useSSL=true","root","123");
        return connection;
    }

    /**
     * 返回类对象
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return Connection.class;
    }

    /**
     * 是否是单例模式创建对象
     * @return
     */
    @Override
    public boolean isSingleton() {
        return false;
    }
}
