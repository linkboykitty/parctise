package com.linkboy.servlet;

import com.linkboy.entity.User;
import com.linkboy.service.Impl.UserServiceImpl1;
import com.linkboy.service.UserService1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    private UserService1 userService1=new UserServiceImpl1();
    private static LoginServlet loginServlet;
    public static LoginServlet getInstance(){
        if(loginServlet==null){
            synchronized (LoginServlet.class){
                if(loginServlet==null){
                    loginServlet=new LoginServlet();
                }
            }
        }
        return  loginServlet;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        login(request,response);
    }
    public void login(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user=userService1.login(username,password);
        if(user==null){
            request.setAttribute("msg","用户名或密码有误");
            doGet(request, response);
        }else {
            request.getSession().setAttribute("user",user);
            response.sendRedirect("/main.do");
            return;
        }
    }
}
