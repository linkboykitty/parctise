package com.linkboy.dao;

import com.linkboy.entity.User;

import java.util.List;

public interface UserDao {
    public User getUserByNameAndPassword(User user);
    public List<User> selectAll();
}
