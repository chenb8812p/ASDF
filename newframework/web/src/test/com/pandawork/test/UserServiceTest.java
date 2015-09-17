package com.pandawork.test;

import com.pandawork.common.entity.User;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * UserServiceTest
 *
 * @author: zhangteng
 * @time: 2015/3/24 20:02
 */
public class UserServiceTest extends AbstractTestCase {

    @Autowired
    private UserService userService;

    @Test
    public void newUser() throws SSException {
        User user = new User();
        user.setUserName("nancnan");
        user.setPassword("12344");

        userService.newUser(user);
    }

    @Test
    public  void checkLogin() throws SSException{
        User user = new User();
        user.setUserName("gghgg");
        user.setPassword("12344");
        System.out.println("*********#$%@#%@#%!@$#!$@!@$%^@&*************");
        System.out.println("EXIST?     "+userService.checkLogin(user));
    }



    @Test
    public  void queryByUserName() throws SSException{
        String userName="18";
        try {
            User user= userService.queryByUserName(userName);
            System.out.println(user.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
