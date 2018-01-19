//package com.linkboy.filter;
//
//
//import com.linkboy.entity.User;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebFilter("/index.jsp")
//public class IsLoginFilter implements Filter {
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletRequest request2 = (HttpServletRequest) request;
//        HttpServletResponse response2 = (HttpServletResponse) response;
//        Cookie[] cookies = request2.getCookies();
//        System.out.println("登陆过滤器工作");
//        int flag=0;
//        String username=null;
//        String password = null;
//        if(cookies!=null){
//            System.out.println("有cookies");
//            for (Cookie cookie : cookies) {
//                if("autologin".equals(cookie.getName())){
//                     User user =(User) request2.getSession().getAttribute("user");
//                    System.out.println("获取session的"+user);
//                    if(user!=null){
//                        username=user.getUsername();
//                        password=user.getPassword();
//                        String value=cookie.getValue();
//                        String[] spit=value.split("&");
//                        if(username.equals(spit[0])&&password.equals(spit[1])){
//                            System.out.println(flag);
//                            flag=1;
//                            break;
//                        }
//                        else {
//                            flag=2;
//                        }
//                    }
//                    else{flag=2;}
//                }else{flag=2;}
//            }
//        }
//    if(flag==1){
//        System.out.println(flag+"应该等于1");
//         request.getRequestDispatcher("/index.jsp").forward(request2,response2);
//    }else {
//        System.out.println(flag+"应该等于0");
//        //request.getRequestDispatcher("/login.jsp").forward(request, response);
//        request.getRequestDispatcher("/servlet/UserServlet?method=login").forward(request,response);
//    }
//
//    }
//
//    @Override
//    public void destroy() {
//
//    }
//}
