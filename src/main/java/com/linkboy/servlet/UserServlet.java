package com.linkboy.servlet;

import com.linkboy.entity.User;
import com.linkboy.service.Impl.UserServiceImpl;
import com.linkboy.service.UserService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;


@WebServlet("/servlet/UserServlet")
public class UserServlet extends BaseServlet{

    private static final long serialVersionUID = 1L;
    public String login(HttpServletRequest request,HttpServletResponse response) {
        System.out.println("进入login方法");
        String username = request.getParameter("username");
        String password=request.getParameter("password");
        UserServiceImpl userService = new UserServiceImpl();
        User user = new User();
        System.out.println("user"+user);
        user.setUsername(username);
        user.setPassword(password);
        User user1 = userService.login(user);
        System.out.println(user1);
        if(user1!= null){
            HttpSession session = request.getSession();
            //把登陆的用户存进session
            session.setAttribute("loginuser",user1);
            //获取全部user的信息，存进session的allusers里面
             List<User> list = userService.selectAll();
             session.setAttribute("allusers",list);

            for (User user2 : list) {
                System.out.println(user2+"恩恩");
            }
            //session.setMaxInactiveInterval(30);
            return "/index.jsp";
        }else{
            request.setAttribute("msg","用户名或密码有误");
            return "/login.jsp";
        }
    }
    public String updateUi(HttpServletRequest request,HttpServletResponse response){
         Long id = Long.parseLong(request.getParameter("id"));
        System.out.println("进入updateservlet");
        UserService userService=new UserServiceImpl();
        User user = userService.selectOne(id);
        System.out.println(user);
        request.getSession().setAttribute("userById",user);
        return "/update.jsp";
    }


}
