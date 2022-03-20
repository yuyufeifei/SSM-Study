import com.gzh.entity.User;
import com.gzh.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GZH
 * @date 2021-11-19
 */
public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        方式一
//        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        // 方式二
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
        for (User user: userMapper.getUserList()) {
            System.out.println(user);
        }
    }
}
