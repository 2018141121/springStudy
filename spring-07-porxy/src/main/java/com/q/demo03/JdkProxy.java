package com.q.demo03;

import com.q.demo02.MyAspect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName MyProxy
 * @Author С��
 * @Date 2021/3/1 20:02
 * jdk������  ��һ�»�������ද̬���ɴ�����   ������ǹ淶�࣬���Ե�����������ʹ��
 **/

public class JdkProxy implements InvocationHandler {

    //1.������Ľӿ�
    private Object target;

    //����������Ƿ������ô������Ҳ����Ŀ����� ���ӽ�����
    public void setTarget(Object target) {
        this.target = target;
    }

    //2.����������� �õ������� ȥ�������ǵ�Ŀ����
    public Object creatProxy(Object target) {
//        1.�������
        ClassLoader classLoader = JdkProxy.class.getClassLoader();
//        2.���������ʵ�ֵ����нӿ�
        Class<?>[] classes = target.getClass().getInterfaces();
//        3.ʹ�ô����࣬������ǿ�����ص��Ǵ���Ķ���
        return Proxy.newProxyInstance(classLoader, classes, this);

    }

    @Override
    //3.�������ʵ���������ؽ��
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //��������
        MyAspect myAspect = new MyAspect();
        //ǰ��ǿ
        myAspect.check(method.getName());
        //��Ŀ����������÷������������� ��̬����ı��ʾ���ʹ�÷������ʵ�ֵ�
        Object invoke = method.invoke(target, args);
        //����ǿ
        myAspect.log(method.getName());
        return invoke;
    }
}
