package com.spring.main;

import com.spring.Dao.UserDao;
import com.spring.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringHibernateMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        UserDao userDao = context.getBean(UserDao.class);

        User user = new User();
        user.setName("Tejas");
        user.setCountry("India");

        userDao.save(user);

        System.out.println("User::" + user);

        List<User> list = userDao.list();

        for (User eachUser : list) {
            System.out.println("User List::" + eachUser);
        }

        context.close();

    }

}
