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

        //     获得项目的上下文路径/访问路径，也就是浏览器中输入什么样的路径名才代表访问该项目
        //     如果使用绝对路径，那就要带上项目的部署路径。比如 /demo03/servlet3。但是项目的部署路径经常变化，最好动态获取。
        //     获取项目的上下文路径/访问路径
        String contextPath = servletContext.getContextPath();
        System.out.println(contextPath);

    }
}
