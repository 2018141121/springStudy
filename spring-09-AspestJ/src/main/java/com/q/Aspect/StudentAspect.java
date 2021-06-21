package com.q.Aspect;

/**
 * @ClassName StudentAspect
 * @Author 小林
 * @Date 2021/3/2 15:44
 **/
public class StudentAspect {
    public void login() {
        System.out.println("===============已经登录了=================");
    }

    public void log() {
        System.out.println("student的所有方法进输出完毕！");
    }
}
