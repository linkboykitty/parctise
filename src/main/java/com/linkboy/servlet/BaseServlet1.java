package com.linkboy.servlet;

import com.linkboy.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BaseServlet1 extends HttpServlet {
    //获取Session的User
    protected User getUser(HttpServletRequest request, HttpServletResponse response){
        return (User)request.getSession().getAttribute("user");
    }
    protected void forward(String uri,HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
        request.getRequestDispatcher(String.format("/%s",uri)).forward(request,response);
    }
}
