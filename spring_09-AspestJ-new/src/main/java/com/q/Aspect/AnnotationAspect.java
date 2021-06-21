package com.q.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @ClassName AnnotationAspect
 * @Author 小林
 * @Date 2021/3/2 16:09
 * 方式：使用注解方法实现Aop
 **/
@Component
@Aspect
//标注为切面类
public class AnnotationAspect {
    @Before("execution(* com.q.service.*.*(..))")
    public void before() {
        System.out.println("注解Aop方法执行前");
    }

    @AfterReturning("execution(* com.q.service.*.*(..))")
    public void afterReturning() {
        System.out.println("注解Aop方法执行后");
    }


    @After("execution(* com.q.service.*.*(..))")
    public void after() {
        System.out.println("最终通知……");
    }

    //环绕通知
    @Around("execution(* com.q.service.*.*(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前");
        //获取签名，也就是执行了那个方法
        Signature signature = proceedingJoinPoint.getSignature();
        System.out.println(signature);
        Object proceed = proceedingJoinPoint.proceed();//向下执行
        System.out.println("环绕后");
        return proceed;
    }


}
