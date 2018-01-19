package com.linkboy.yuandan.dao.test;

import com.linkboy.dao.UserDao1;
import com.linkboy.entity.User;
import com.linkboy.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class selectUserByIdAndPwdTest {
    private SqlSession sqlSession;
    private UserDao1 userDao1;
    @Before
    public void before(){
        sqlSession= MyBatisUtils.getSqlSession();
        userDao1=sqlSession.getMapper(UserDao1.class);
    }
    @Test
    public void test(){
        User user=new User();
        user.setUsername("qwe");
        user.setPassword("qwe");
        userDao1.selectUserByIdAndPwd(user);
        System.out.println(userDao1.selectUserByIdAndPwd(user));
    }
    @After
    public void after(){
        if(sqlSession!=null){
            sqlSession.close();
        }
    }
}
