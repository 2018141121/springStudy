package com.q.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName person
 * @Author С��
 * @Date 2021/3/1 8:44
 **/


//��� // �൱�������ļ��� <bean id="user" class="��ǰע�����"/>

//������ע��
// �൱�������ļ��� <bean id="user" class="��ǰע�����"/>
@Component
public class person {

    //    public String name = "hello";   //����ע��1��ʽ
    // �൱�������ļ��� <property name="name" value="hello2"/>
    @Value("hello2")
    public String name;              //����ע��2��ʽ


    //����ע��3SET��ʽ
//
//    public String name;
//
//    @Value("ע��ע����Ϣ������name")
//    public void setName(String name) {
//        this.name = name;
//    }
}
