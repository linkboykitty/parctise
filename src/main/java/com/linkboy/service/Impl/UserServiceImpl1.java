package com.linkboy.service.Impl;

import com.linkboy.dao.UserDao;
import com.linkboy.dao.UserDao1;
import com.linkboy.entity.User;
import com.linkboy.service.BaseService;
import com.linkboy.service.UserService1;
import com.linkboy.servlet.BaseServlet;

public class UserServiceImpl1 extends BaseService implements UserService1 {

    private UserDao userDao=(UserDao)getDao(UserDao1.class);
    @Override
    public User login(String username, String password) {
        User param = new User();
        param.setUsername(username);
        param.setPassword(password);
        UserDao1 userDao1 = (UserDao1)getDao(UserDao1.class);
        return userDao1.selectUserByIdAndPwd(param);
    }

    @Override
    public void insert(User user) {

    }
}
