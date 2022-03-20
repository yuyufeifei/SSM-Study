package com.gzh.aop.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author GZH
 * @date 2021-11-15
 * 方式三：使用注解方式实现AOP
 */
@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.gzh.aop.UserServiceImpl.*(..))")
    void before() {
        System.out.println("方法执行前。。");
    }

    @After("execution(* com.gzh.aop.UserServiceImpl.*(..))")
    void after() {
        System.out.println("方法执行后。。");
    }

    //在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
    @Around("execution(* com.gzh.aop.UserServiceImpl.*(..))")
    void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前");

        //获得签名
        Signature signature = pjp.getSignature();
        System.out.println("signature：" + signature);

        //执行方法
        pjp.proceed();

        System.out.println("环绕后");
    }
//    执行TestAop()后的结果：
//    环绕前
//    signature：void com.gzh.aop.UserService.add()
//    方法执行前。。
//    增加了一个用户
//    方法执行后。。
//    环绕后
}
