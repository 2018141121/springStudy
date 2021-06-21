package com.q.Test;

import com.q.Mapper.UserMapper;
import com.q.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @ClassName Test01
 * @Author –°¡÷
 * @Date 2021/3/14 15:08
 * @describe: [√Ë ˆ]
 **/
public class Test01 {
    @Test
    public void test01() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = applicationContext.getBean("userMapperImpl02", UserMapper.class);
        List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);

        }

    }


}

