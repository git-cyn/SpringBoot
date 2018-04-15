package com.web.service;

import com.web.domain.User;

import java.util.List;

/**
 * Created by admin on 2018/4/15.
 */
public interface UserService {

    public User getUser();

    public List<User> getUsers();
}
