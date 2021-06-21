import com.q.service.Student;
import com.q.service.UserService01;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Test
 * @Author С��
 * @Date 2021/3/2 14:35
 **/
public class Test {
    @org.junit.Test
    public void test1() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService01 userService01 = (UserService01) applicationContext.getBean("userService01");
//        userService01.add();


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("student.xml");
        Student student = applicationContext.getBean("student", Student.class);
        student.buy();
    }

    @org.junit.Test
    public void test02() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
//        ������һ������bean��Ҫ�ҵ���Ŀ�����Ȼ����Ҫʵ�ֵ��ǽӿڣ���Ϊ�ǻ��ڽӿ�ʵ�ֵ�
        UserService01 annotationAspect = applicationContext.getBean("userService01Impl", UserService01.class);
//        UserService01 annotationAspect = applicationContext.getBean("userService01", UserService01.class);
        annotationAspect.add();
    }
}
