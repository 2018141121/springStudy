package Test;

import com.q.service.UserService01;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName MyTest
 * @Author С��
 * @Date 2021/3/1 23:20
 **/

//��󣺿�ʼ����
public class MyTest {
    @Test
    public void test01() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService01 userDaoProxy = applicationContext.getBean("userDaoProxy", UserService01.class);
        userDaoProxy.add();
    }
}
