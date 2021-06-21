package com.q.Aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @ClassName Surround
 * @Author 小林
 * @Date 2021/3/1 22:57 环绕通知类
 **/
//第三步：写切面类
public class Surround implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        check();
        //执行当前目标方法
        Object proceed = methodInvocation.proceed();
        log();
        return proceed;
    }

    public void check() {
        System.out.println("check!");
    }

    public void log() {
        System.out.println("输出日志文件！");
    }
}
