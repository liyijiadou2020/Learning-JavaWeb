package com.atguigu.servlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: liyijia
 * @version: 0.0
 * @create time: 2024-01-2024/1/20
 * @description: 使用 Servlet 进行用户名校验
 */
public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 根据参数名获取参数值，无论参数是在url还是在请求体中
        String username = req.getParameter("username");
        if ("atguigu".equals(username)) {
            resp.getWriter().write("<h1>NO, the username cannot be atguigu!</h1>");
        } else {
            resp.getWriter().write("<h1>OK</h1>");
        }
    }
}
