import com.q.pojo.User;
import com.q.pojo.student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01() {

        //  p�����ռ�ע�����
        ApplicationContext context = new ClassPathXmlApplicationContext("UserBeans.xml");
        //��һ�ַ�ʽ����Ҫǿת
        User user = (User) context.getBean("user");
        //�ڶ��ַ�ʽ������ǿת
        User user1 = context.getBean("user2", User.class);
        System.out.println(user1.toString());

        // c�����ռ�ע��
        User user2 = context.getBean("user2", User.class);
        System.out.println(user2.toString());
        System.out.println(user1 == user2);
    }

    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        student student = (student) context.getBean("student");
        System.out.println(student.toString());


    }
}
