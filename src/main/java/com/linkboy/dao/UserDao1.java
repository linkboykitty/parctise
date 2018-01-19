package com.linkboy.dao;

import com.linkboy.entity.User;

public interface UserDao1 {
    public User selectUserByIdAndPwd(User user);
    public void insert(User user);
}
