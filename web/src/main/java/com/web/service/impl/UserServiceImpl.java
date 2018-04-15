package com.web.service.impl;

import com.web.domain.User;
import com.web.domain.UserRepository;
import com.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2018/4/15.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Cacheable(value="user-key")
    @Override
    public User getUser() {
        User user=userRepository.findByUserName("aa");
        return user;
    }
    @Cacheable(value="getUsers")
    @Override
    public List<User> getUsers() {
        List<User> users=userRepository.findAll();
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return users;
    }
}
