package com.linkboy.servlet;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

public class DispatcherServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String requestURI = request.getRequestURI();
         if(requestURI.contains("login.do")){
            LoginServlet.getInstance().service(request,response);
         }
         else if (requestURI.contains("main.do")){
             MainServlet.getInstance().service(request,response);
         }else if(requestURI.contains("logout.do")){
             LogoutServlet.getInstance().service(request,response);
         }else if(requestURI.contains("user.do")){

         }
    }


    }
