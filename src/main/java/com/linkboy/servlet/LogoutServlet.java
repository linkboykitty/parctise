package com.linkboy.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LogoutServlet extends HttpServlet {
    private static LogoutServlet logoutServlet;
    public static LogoutServlet getInstance() {
        if (logoutServlet == null) {
            synchronized (LogoutServlet.class) {
                if (logoutServlet == null) {
                    logoutServlet = new LogoutServlet();
                }
            }
        }
        return logoutServlet;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().invalidate();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
