import com.q.demo03.JdkProxy;
import com.q.demo03.UserDao;
import com.q.demo03.UserDaoImpl;
import org.junit.Test;

/**
 * @ClassName MyTeat1
 * @Author 小林
 * @Date 2021/3/1 21:00
 **/
public class MyTeat1 {
    @Test
    public void test1() {
        //1.创建目标对象 也就是真实对象
        UserDaoImpl userDao = new UserDaoImpl();
        //2.创建代理对象
        JdkProxy jdkProxy = new JdkProxy();
        jdkProxy.setTarget(userDao);//3.设置要被代理的对象
        //4.从代理对象中获取增强后的目标对象
        UserDao proxy = (UserDao) jdkProxy.creatProxy(userDao);

        //5.用代理去执行方法
        proxy.adduser();
        System.out.println("==============");
        proxy.deleteUser();
    }

}
