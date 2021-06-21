package com.q.Aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @ClassName Surround
 * @Author С��
 * @Date 2021/3/1 22:57 ����֪ͨ��
 **/
//��������д������
public class Surround implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        check();
        //ִ�е�ǰĿ�귽��
        Object proceed = methodInvocation.proceed();
        log();
        return proceed;
    }

    public void check() {
        System.out.println("check!");
    }

    public void log() {
        System.out.println("�����־�ļ���");
    }
}
