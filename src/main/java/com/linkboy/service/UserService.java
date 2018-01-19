package com.linkboy.service;

import com.linkboy.entity.User;

import java.util.List;

public interface UserService {
    public User login(User user);
    public List<User> selectAll();
    public User selectOne(Long id);
    public void insertById(User user);
}
