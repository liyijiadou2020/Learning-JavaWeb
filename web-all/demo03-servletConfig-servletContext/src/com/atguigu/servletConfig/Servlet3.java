package com.atguigu.servletConfig;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author: liyijia
 * @version: 0.0
 * @create time: 2024-01-2024/1/24
 * @description: 想要往 web/upload/下的 a.txt 里面写数据
 */

@WebServlet("/servlet3")
public class Servlet3 extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();

        // 获得有个指向部署位置下某个文件/目录的磁盘真实路径
        String upload = servletContext.getRealPath("upload");
        // FileOutputStream fileOutputStream = new FileOutputStream(upload + "/a.txt");
        System.out.println(upload);

    }
}
