package com.zmq.test;

import com.zmq.entity.People;
import com.zmq.service.PeopleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author zmq
 * @date 2020/8/31
 * @since 1.8
 */
@RunWith(SpringJUnit4ClassRunner.class)//由SpringJUnit4ClassRunner启动测试
@ContextConfiguration("classpath:applicationContext.xml")//spring的配置文件路径
public class AnnotationTest {

    @Autowired
    private PeopleService ps;

    @Test
    public void testAnnotation(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        PeopleService peopleServiceImpl = (PeopleService) applicationContext.getBean("peopleServiceImpl");
        List<People> peopleList = peopleServiceImpl.queryPeopleList();
        for (People people : peopleList) {
            System.out.println(people);
        }
    }

    /**
     * 测试使用注解执行测试，
     */
    @Test
    public void testAnnotationTest(){
        List<People> peopleList = ps.queryPeopleList();
        for (People people : peopleList) {
            System.out.println(people);
        }
    }

    /**
     * 测试程序异常事务是否回滚
     *          result:程序发生异常时成功回滚事务...
     */
    @Test
    public void testProgramExceptionTxIsRollback(){
        int i = ps.deleteInfoById(7);
        if(i > 0){
            System.out.println("success...");
        }else {
            System.out.println("failed...");
        }
    }
}
