package com.zgc.test;

import com.zgc.dao.UserDao;
import com.zgc.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        UserDao userDao1 = applicationContext.getBean(UserDao.class);
        userDao.save();
        userDao1.save();
        System.out.println(userDao);
        System.out.println(userDao1);
    }

    @Test
    public void test02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        UserService userService = applicationContext.getBean(UserService.class);
//        userDao.save();
        userService.save();
        userService.print();
        System.out.println(userDao);
        System.out.println(userService);
    }
}
