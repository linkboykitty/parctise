package com.linkboy.servlet;

import com.linkboy.service.BaseService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainServlet extends BaseServlet1 {
    private static MainServlet mainServlet;
    public static MainServlet getInstance(){
        if(mainServlet==null){
            synchronized (MainServlet.class){
                if (mainServlet==null){
                    mainServlet=new MainServlet();
                }
            }
        }
        return mainServlet;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        forward("index.jsp",req,resp);
    }
}
