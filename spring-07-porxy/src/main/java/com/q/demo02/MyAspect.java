package com.q.demo02;

/**
 * @ClassName MyAspect
 * @Author 小林
 * @Date 2021/3/1 20:31
 * 切面类
 **/

public class MyAspect {
    //切面类：可以存在很多个增强的方法
    public void check(String msg) {
        System.out.println("开启"+msg+"工作，检查情况！");
    }

    public void log(String msg) {
        System.out.println("输出检查"+msg+"中是否出现的问题！");
    }

}
