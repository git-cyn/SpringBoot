package com.web.service;

import com.web.domain.User;
import org.hibernate.annotations.Source;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by admin on 2018/4/15.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    UserService userService;

    @Test
    public void getUser() throws Exception {
        userService.getUser();
    }

    @Test
    public void getUsers() throws Exception {
        List<User> list = userService.getUsers();
        System.out.println(list.size());
    }

}