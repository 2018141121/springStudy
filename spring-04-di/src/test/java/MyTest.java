import com.q.pojo.User;
import com.q.pojo.student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01() {

        //  p命名空间注入测试
        ApplicationContext context = new ClassPathXmlApplicationContext("UserBeans.xml");
        //第一种方式，需要强转
        User user = (User) context.getBean("user");
        //第二种方式，不用强转
        User user1 = context.getBean("user2", User.class);
        System.out.println(user1.toString());

        // c命名空间注入
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
