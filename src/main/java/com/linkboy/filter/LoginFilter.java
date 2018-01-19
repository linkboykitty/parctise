package com.linkboy.filter;

import com.linkboy.entity.User;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebFilter("*.do")
public class LoginFilter implements Filter {
    private FilterConfig config;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String requestURI = request.getRequestURI();
        User user = (User)request.getSession().getAttribute("user");

        if(user!=null||requestURI.contains("login.do")){
           if(user!=null&&requestURI.contains("login.do")){
               response.sendRedirect("/main.do");
               return;
           }
           filterChain.doFilter(request,response);
           return;
        }
        if(user==null){
            response.sendRedirect("/login.do");
            return;
        }
    }

    @Override
    public void destroy() {

    }
}
