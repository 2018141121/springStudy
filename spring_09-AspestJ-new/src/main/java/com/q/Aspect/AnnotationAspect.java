package com.q.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @ClassName AnnotationAspect
 * @Author С��
 * @Date 2021/3/2 16:09
 * ��ʽ��ʹ��ע�ⷽ��ʵ��Aop
 **/
@Component
@Aspect
//��עΪ������
public class AnnotationAspect {
    @Before("execution(* com.q.service.*.*(..))")
    public void before() {
        System.out.println("ע��Aop����ִ��ǰ");
    }

    @AfterReturning("execution(* com.q.service.*.*(..))")
    public void afterReturning() {
        System.out.println("ע��Aop����ִ�к�");
    }


    @After("execution(* com.q.service.*.*(..))")
    public void after() {
        System.out.println("����֪ͨ����");
    }

    //����֪ͨ
    @Around("execution(* com.q.service.*.*(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("����ǰ");
        //��ȡǩ����Ҳ����ִ�����Ǹ�����
        Signature signature = proceedingJoinPoint.getSignature();
        System.out.println(signature);
        Object proceed = proceedingJoinPoint.proceed();//����ִ��
        System.out.println("���ƺ�");
        return proceed;
    }


}
