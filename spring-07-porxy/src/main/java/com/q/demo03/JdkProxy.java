package com.q.demo03;

import com.q.demo02.MyAspect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName MyProxy
 * @Author 小林
 * @Date 2021/3/1 20:02
 * jdk代理类  等一下会用这个类动态生成代理类   这个类是规范类，可以当作工具类来使用
 **/

public class JdkProxy implements InvocationHandler {

    //1.被代理的接口
    private Object target;

    //设置这个就是方便设置代理对象，也就是目标对象 增加解耦性
    public void setTarget(Object target) {
        this.target = target;
    }

    //2.创建代理对象 得到代理类 去代理我们的目标类
    public Object creatProxy(Object target) {
//        1.类加载器
        ClassLoader classLoader = JdkProxy.class.getClassLoader();
//        2.被代理对象实现的所有接口
        Class<?>[] classes = target.getClass().getInterfaces();
//        3.使用代理类，进行增强，返回的是代理的对象
        return Proxy.newProxyInstance(classLoader, classes, this);

    }

    @Override
    //3.处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //声明切面
        MyAspect myAspect = new MyAspect();
        //前增强
        myAspect.check(method.getName());
        //在目标类上面调用方法，传进参数 动态代理的本质就是使用反射机制实现的
        Object invoke = method.invoke(target, args);
        //后增强
        myAspect.log(method.getName());
        return invoke;
    }
}
