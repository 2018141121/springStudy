package com.q.demo02;

/**
 * @ClassName MyAspect
 * @Author С��
 * @Date 2021/3/1 20:31
 * ������
 **/

public class MyAspect {
    //�����ࣺ���Դ��ںܶ����ǿ�ķ���
    public void check(String msg) {
        System.out.println("����"+msg+"��������������");
    }

    public void log(String msg) {
        System.out.println("������"+msg+"���Ƿ���ֵ����⣡");
    }

}
