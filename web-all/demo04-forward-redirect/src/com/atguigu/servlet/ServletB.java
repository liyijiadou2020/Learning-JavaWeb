package com.atguigu.servlet;

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
 * @description: 实际处理请求的 Servlet
 */
@WebServlet("/servletB")
public class ServletB extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        System.out.println(req.getParameter("username"));
        System.out.println(req.getAttribute("reqKey"));
        res.getWriter().write("serveB response.");
    }
}
