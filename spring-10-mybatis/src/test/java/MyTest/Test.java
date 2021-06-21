package MyTest;

import com.q.Mapper.UserMapper;
import com.q.Mapper.UserMapperImpl;
import com.q.Mapper.UserMapperImpl2;
import com.q.pojo.User;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @ClassName Test
 * @Author 小林
 * @Date 2021/3/3 0:24
 **/
public class Test extends TestCase {
//    @org.junit.Test
//    public void test1() {
//        SqlSession sqlsession = mybatisUtils.getSqlSession();
//        UserMapper userMapper = sqlsession.getMapper(UserMapper.class);
//        List<User> user = userMapper.getUser();
//        for (User user1 : user) {
//            System.out.println(user1);
//        }
//    }


    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = applicationContext.getBean("userMapper", UserMapperImpl.class);
        List<User> user = userMapper.getUser();
        System.out.println(user);
    }

    public void test3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapperImpl2 = applicationContext.getBean("userMapperImpl2", UserMapperImpl2.class);
        List<User> user = userMapperImpl2.getUser();
        System.out.println("输出user所有数据：");
        for (User user1 : user) {
            System.out.println(user1);
        }
    }
}
