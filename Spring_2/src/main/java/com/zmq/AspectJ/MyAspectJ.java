package com.zmq.AspectJ;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author zmq
 * @date 2020/8/28
 * @since 1.8
 *
 *      AspectJ  切面
 *
 *
 *      @Before
 *      前置增强，相当于BeforeAdvice的功能
 *
 *      @AfterReturning
 *      后置增强，相当于AfterReturningAdvice
 *
 *      @Around
 *      环绕增强，相当于MethodInterceptor
 *
 *      @AfterThrowing
 *      抛出增强，相当于ThrowsAdvice
 *
 *      @After
 *      Final增强，不管是抛出异常或者是正常退出，该增强都会得到执行，该增强没有对应的增强接口，可以把它看成ThrowsAdvice        和AfterReturningAdvice的混合物，一般用于释放资源，相当于try{}finally{}
 *
 *      环绕增强
 *
 *      ProceedingJoinPoint
 *
 *      proceed
 */
@Aspect
public class MyAspectJ {
    /**
     * 前置增强
     */
    @Before("execution(* seeAop(..))")
    public void aopBefore(){
        System.out.println("AspectJ start ...");
    }

    /**
     *后置增强
     */
    @AfterReturning("execution(* seeAop(..))")
    public void aopAfter(){
        System.out.println("AspectJ after ...");
    }


    @Before("execution(java.lang.String seeAop2(java.lang.Integer))")
    public void aopBefore2(){
        int a , b ;
        a = 5;
        b = a + 11;
        System.out.println("have param method ..." + b +"+" + a + "=" + (a+b));
    }


    public void aopBefore3(){
        System.out.println("AspectJ start aaa...");
    }

    /**
     *后置增强
     */
    public void aopAfter2(){
        System.out.println("AspectJ after aaa...");
    }
}
