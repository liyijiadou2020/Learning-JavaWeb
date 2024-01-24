package com.atguigu.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

/**
 * @author: liyijia
 * @version: 0.0
 * @create time: 2024-01-2024/1/24
 * @description: 转发请求的 Servlet
 */

@WebServlet("/servletA")
public class ServletA extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        RequestDispatcher servletB = req.getRequestDispatcher("servletB");
        String username = req.getParameter("username");
        req.setAttribute("reqKey", "这是来自 servletA 的请求转发");
        servletB.forward(req, res);

    }
}
