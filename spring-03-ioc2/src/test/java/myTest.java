import com.q.pojo.User;
import com.q.pojo.User2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) applicationContext.getBean("user");
        user.showName();

//        User2 user1 = applicationContext.getBean("user", user.getClass());
//        user1.showName();


    }

}
