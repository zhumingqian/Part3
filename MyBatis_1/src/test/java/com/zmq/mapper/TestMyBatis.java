package com.zmq.mapper;
import com.zmq.entity.User;
import com.zmq.tools.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZMQ
 * @Date 2020/8/25
 * @since 1.8
 */
public class TestMyBatis {


    /**
     * 查询测试
     * @throws IOException
     */
    @Test
    public void test() throws IOException {
        //使用流读取mybatis配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        //创建sqlsessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获得代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //通过代理对象获得结果
        System.out.println(userMapper.selectUserById(1).getName());
    }

    /**
     * 通过id和年龄查询信息
     */
    @Test
    public void testQueryByIdAndAge(){
        UserMapper userMapper = MyBatisUtils.getProxyObj(UserMapper.class);
        User user = userMapper.selectUserByIdAndAge(1, 22);
        System.out.println(user.getName());
    }

    /**
     * 测试模糊查询
     */
    @Test
    public void testQueryByLike(){
        UserMapper userMapper = MyBatisUtils.getProxyObj(UserMapper.class);
        User user = userMapper.selectUserByLikeName("张");
        System.out.println(user.getName());

    }

    /**
     * map形式传参数
     */
    @Test
    public void testQueryByMap(){
        UserMapper userMapper = MyBatisUtils.getProxyObj(UserMapper.class);
        Map map = new HashMap();
        map.put("mId",1);
        map.put("mAge",22);
        User user = userMapper.selectUserByMap(map);
        System.out.println(user.getName());
    }

    /**
     * 添加测试
     */
    @Test
    public void testAddUser(){
        UserMapper userMapper = MyBatisUtils.getProxyObj(UserMapper.class);
        User user = new User();
        user.setName("张无忌");
        user.setAge(23);
        int i = userMapper.addUser(user);
        if(i > 0){
            MyBatisUtils.commit();
            System.out.println("添加成功...");
        }else{
            System.out.println("添加失败...");
            MyBatisUtils.rollback();
        }
    }

    /**
     * 更新测试
     */
    @Test
    public void testUpdate(){
        UserMapper userMapper = MyBatisUtils.getProxyObj(UserMapper.class);
        User user = new User();
        user.setId(1);
        user.setName("guduqiubai");
        user.setAge(88);
        int updateUserById = userMapper.updateUserById(user);
        if(updateUserById > 0){
            MyBatisUtils.commit();
            System.out.println("更新成功...");
        }else{
            System.out.println("failed");
            MyBatisUtils.rollback();
        }
    }

    /**
     * 删除测试
     */
    @Test
    public void testDeleteUserById(){
        UserMapper userMapper = MyBatisUtils.getProxyObj(UserMapper.class);
        int deleteUserById = userMapper.deleteUserById(1);
        if(deleteUserById > 0){
            MyBatisUtils.commit();
            System.out.println("删除成功...");
        }else{
            MyBatisUtils.rollback();
            System.out.println("删除失败...");
        }
    }

    /**
     * 添加主键回填测试
     */
    @Test
    public void testGetId(){
        UserMapper userMapper = MyBatisUtils.getProxyObj(UserMapper.class);
        User user = new User();
        user.setName("jmsw");
        user.setAge(56);
        int i = userMapper.addAfterGetId(user);
        if(i > 0){
            MyBatisUtils.commit();
            System.out.println("添加成功...");
            System.out.println(user.getId());
        }else{
            System.out.println("添加失败...");
            MyBatisUtils.rollback();
        }
    }

    /**
     * 二级缓存
     */
    @Test
    public void testCacheTwo(){
        //第一次查询
        System.out.println("---------------第一次查询--------------");
        SqlSession sqlSession1 = MyBatisUtils.createSqlSession();
        UserMapper session1Mapper = sqlSession1.getMapper(UserMapper.class);
        User user1 = session1Mapper.selectUserById(5);
        System.out.println(user1);
        sqlSession1.close();

        System.out.println("---------------中途修改--------------");
        //中途进行更新操作
        SqlSession sqlSession2 = MyBatisUtils.createSqlSession();
        UserMapper session2Mapper = sqlSession2.getMapper(UserMapper.class);
        User user2 = new User();
        user2.setId(5);
        user2.setName("ZHANGWUJI");
        user2.setAge(13);
        session2Mapper.updateUserById(user2);
        sqlSession2.commit();
        System.out.println(user2);

        System.out.println("---------------第二次查询--------------");
        //第二次查询
        SqlSession sqlSession3 = MyBatisUtils.createSqlSession();
        UserMapper session3Mapper = sqlSession3.getMapper(UserMapper.class);
        User user3 = session3Mapper.selectUserById(5);
        System.out.println(user3);
    }


}
