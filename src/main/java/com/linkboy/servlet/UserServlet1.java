package com.linkboy.servlet;

import com.linkboy.service.Impl.UserServiceImpl1;
import com.linkboy.service.UserService1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet1 extends BaseServlet1 {
    private UserServlet1 userServlet1;
    public UserServlet1 getInstance(){
        if(userServlet1==null){
            synchronized (UserServlet1.class){
                if(userServlet1==null){
                    userServlet1=new UserServlet1();
                }
            }
        }
        return  userServlet1;
    }
    private UserService1 userService1=new UserServiceImpl1();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method=req.getParameter("method");
        //新增用户页面
        if("add".equals(method)){
            forward("userAdd.jsp",req,resp);
        }
        //显示用户页面
         else if("list".equals(method)){
            forward("userList.jsp",req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("method");
        if("add".equals(method)){
            addUser(req, resp);
        }
    }
    private void addUser(HttpServletRequest request,HttpServletResponse response){
        String loginId = request.getParameter("Id");

    }
}
