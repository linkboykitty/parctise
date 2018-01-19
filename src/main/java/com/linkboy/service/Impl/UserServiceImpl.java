package com.linkboy.service.Impl;

import com.linkboy.dao.UserDao;
import com.linkboy.entity.User;
import com.linkboy.service.UserService;
import com.linkboy.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserServiceImpl implements UserService {
    private SqlSession sqlSession;
    private UserDao userDao;
    public UserServiceImpl(){
        sqlSession= MyBatisUtils.getSqlSession();
        userDao=sqlSession.getMapper(UserDao.class);
    }


    @Override
    public User login(User user) {
        User user1 = sqlSession.selectOne("getUserByNameAndPassword", user);
        return user1;
    }

    @Override
    public List<User> selectAll() {
        List<User> list=sqlSession.selectList("selectAll");
        return list;
    }

    @Override
    public User selectOne(Long id) {
        User user=sqlSession.selectOne("id");
        return user;
    }

    @Override
    public void insertById(User user) {
        int insertById = sqlSession.insert("insertById", user);
    }
}
