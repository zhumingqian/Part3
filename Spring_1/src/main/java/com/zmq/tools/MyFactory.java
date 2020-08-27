package com.zmq.tools;

import java.io.IOException;
import java.util.Properties;

/**
 * @author zmq
 * @date 2020/8/27
 * @since 1.8
 * 自定义工厂类
 */
public class MyFactory {
    /**
     * 读取配置文件对象
     */
    private Properties properties = new Properties();

    public MyFactory() {
    }

    public MyFactory(String config) throws IOException {
        //加载配置文件
        properties.load(MyFactory.class.getResourceAsStream(config));

    }

    /**
     * 获取对象
     */
    public Object getBean(String beanName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //获得类路径
        String classPath = properties.getProperty(beanName);
        if (classPath != null) {
            Class clas = null ;
            //反射：获得对象
            clas = Class.forName(classPath);
            //创建对象
            return clas.newInstance();
        }
        return null;
    }
}
