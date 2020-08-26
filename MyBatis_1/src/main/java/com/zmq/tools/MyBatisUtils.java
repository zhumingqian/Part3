package com.zmq.tools;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author ZMQ
 * @Date 2020/8/25
 * @since 1.8
 */
public class MyBatisUtils {
    private static SqlSessionFactory factory;

    private static ThreadLocal<SqlSession> sessionThreadLocal = new ThreadLocal<SqlSession>();
    static {
        try {
            //读取mybatis-config.xml配置文件
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            //将流注入到工厂对象中
            factory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 获取SqlSession对象
     * @return
     */
    public static SqlSession getSqlSession(){
        SqlSession sqlSession = sessionThreadLocal.get();
        if (sqlSession == null) {//如果SqlSession为空
            //创建SqlSession对象
            sqlSession = factory.openSession();
            //将SqlSession存到本地线程对象中
            sessionThreadLocal.set(sqlSession);
        }
        return sqlSession;
    }


    /**
     * 关闭SqlSession
     */
    public static void closeSqlSession(){
        SqlSession sqlSession = sessionThreadLocal.get();
        sqlSession.close();
        sessionThreadLocal.remove();
    }

    /**
     * 获得代理对象
     * @param cla
     * @param <T>
     * @return
     */
    public static <T> T getProxyObj(Class<T> cla){
        SqlSession sqlSession = getSqlSession();
        return sqlSession.getMapper(cla);
    }

    /**
     * 提交事务
     */
    public static void commit(){
        //获得SqlSession对象
        SqlSession sqlSession = sessionThreadLocal.get();
        //开启事务
        sqlSession.commit();
        //关闭SqlSession对象
        closeSqlSession();
    }

    /**
     * 回滚事务
     */
    public static void rollback(){
        SqlSession sqlSession = sessionThreadLocal.get();
        sqlSession.rollback();
        closeSqlSession();
    }

    /**
     * 创建SqlSession
     * @return
     */
    public static SqlSession createSqlSession(){
        return factory.openSession();
    }





}
