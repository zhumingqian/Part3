package com.zmq.test;

import com.zmq.entity.VHero;
import com.zmq.service.VHeroService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author zmq
 * @date 2020/8/31
 * @since 1.8
 */
public class test1 {
    /**
     * 测试
     */
    @Test
    public void queryAll(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        VHeroService vHeroServiceImpl = (VHeroService) applicationContext.getBean("vHeroServiceImpl");
        List<VHero> heroList = vHeroServiceImpl.queryAllVHero();
        for (VHero vHero : heroList) {
            System.out.println(vHero);
        }
    }

    /**
     * 测试事务回滚是否生效
     */
    @Test
    public void deleteInfo(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        VHeroService vHeroServiceImpl = (VHeroService) applicationContext.getBean("vHeroServiceImpl");
        if(vHeroServiceImpl.deleteInfoById(8) > 0){
            System.out.println("success...");
        }else {
            System.out.println("failed...");
        }
    }
}
