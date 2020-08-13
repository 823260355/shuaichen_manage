package com.shuaichen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 退出功能
 */
@Controller
public class LoginOutController {
    @RequestMapping("/loginOut")
    public void loginOut(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("当前用户退出了...");
        //1.让当前session失效
        request.getSession().invalidate();
        //2.请求重定向到login.jsp
        response.sendRedirect("login.jsp");
    }

}
