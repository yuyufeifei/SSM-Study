package com.gzh;

import com.gzh.aop.UserService;
import com.gzh.config.GzhConfig;
import com.gzh.entity.Cat;
import com.gzh.entity.People;
import com.gzh.entity.Student;
import com.gzh.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GZH
 * @date 2021-11-06
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        User user = (User) context.getBean("user");
//        System.out.println(user);

        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }

    @Test
    public void testPeople() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        People people = context.getBean("people", People.class);
        people.getCat().sout();
        people.getDog().sout();
    }

    @Test
    public void TestConfig() {
        ApplicationContext context = new AnnotationConfigApplicationContext(GzhConfig.class);
        Cat cat = context.getBean("getCat", Cat.class);
    }

    @Test
    public void TestAop() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理，代理的是接口
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }
}
