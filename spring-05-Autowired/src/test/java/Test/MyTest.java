package Test;

import com.q.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName MyTest
 * @Author С��
 * @Date 2021/2/28 11:48
 **/

public class MyTest {
    @Test
    public void test1() {
        //        ��������
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //��ȡ����
        Person person = applicationContext.getBean("person", Person.class);
//        System.out.println(person.toString());
        //����ͨ�����÷����������
        person.getDog().show2();
        person.getCat().show();
        System.out.println(person.toString());
//        person.getDog().toString();
    }

    @Test
    public void test2() {
        System.out.println("hello");
    }
}
