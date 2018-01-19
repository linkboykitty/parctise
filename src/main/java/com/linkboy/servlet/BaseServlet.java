package com.linkboy.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

@WebServlet("/servlet/BaseServlet")
public class BaseServlet extends HttpServlet{
    public BaseServlet(){
        System.out.println("base开始工作");
    }
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("baseservlet工作");

        Class<? extends BaseServlet> clazz = this.getClass();
        String m = req.getParameter("method");
        if(m==null){
            m="/index";
        }
        try {
            Method method = clazz.getMethod(m, HttpServletRequest.class,HttpServletResponse.class);
            String path = (String) method.invoke(this,req,resp);
            if(path!=null){
                req.getRequestDispatcher(path).forward(req, resp);
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public String index(HttpServletRequest request,HttpServletResponse response){
        return "/index.jsp";
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }


}
