package com.q.Aspect;

/**
 * @ClassName MyAspect
 * @Author 小林
 * @Date 2021/3/2 14:50
 **/
//第三步：写切面类 也即是通知
public class MyAspect {
    public void before(){
        System.out.println("============方法执行前==================");
    }
    public void after(){
        System.out.println("===================方法执行后===========");
    }

}
