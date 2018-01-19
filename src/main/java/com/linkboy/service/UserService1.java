package com.linkboy.service;

import com.linkboy.entity.User;

public interface UserService1 {
    public User login(String username, String password);
    public void insert(User user);
}
