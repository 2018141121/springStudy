package MyTest;

import com.q.Mapper.UserMapper;
import com.q.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @ClassName Test
 * @Author 小林
 * @Date 2021/3/3 0:24
 **/
public class Test {

    @org.junit.Test
    //整合方式一
    public void test02() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapperImpl = applicationContext.getBean("userMapperImpl", UserMapper.class);
        List<User> users = userMapperImpl.getUsers();
        for (User user : users) {
            System.out.println(user);

        }
    }


    @org.junit.Test
    //整合方式二
    public void test04() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = (UserMapper) context.getBean("userMapperImpl02");
        List<User> user = mapper.getUsers();
        for (User user1 : user) {
            System.out.println(user1);

        }

    }

}
