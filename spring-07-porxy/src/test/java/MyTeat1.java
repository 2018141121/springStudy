import com.q.demo03.JdkProxy;
import com.q.demo03.UserDao;
import com.q.demo03.UserDaoImpl;
import org.junit.Test;

/**
 * @ClassName MyTeat1
 * @Author С��
 * @Date 2021/3/1 21:00
 **/
public class MyTeat1 {
    @Test
    public void test1() {
        //1.����Ŀ����� Ҳ������ʵ����
        UserDaoImpl userDao = new UserDaoImpl();
        //2.�����������
        JdkProxy jdkProxy = new JdkProxy();
        jdkProxy.setTarget(userDao);//3.����Ҫ������Ķ���
        //4.�Ӵ�������л�ȡ��ǿ���Ŀ�����
        UserDao proxy = (UserDao) jdkProxy.creatProxy(userDao);

        //5.�ô���ȥִ�з���
        proxy.adduser();
        System.out.println("==============");
        proxy.deleteUser();
    }

}
