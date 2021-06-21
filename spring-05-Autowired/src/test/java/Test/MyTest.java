package Test;

import com.q.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName MyTest
 * @Author 小林
 * @Date 2021/2/28 11:48
 **/

public class MyTest {
    @Test
    public void test1() {
        //        创建容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //获取对象
        Person person = applicationContext.getBean("person", Person.class);
//        System.out.println(person.toString());
        //这里通过调用方法进行输出
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
