package com.shuaichen.controller;


import com.shuaichen.entity.AccUser;
import com.shuaichen.service.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录功能
 */
@Controller
public class LoginController {
    //声明并常见service对象
    @Autowired
    PasswordService passwordService;
    @RequestMapping("/login")
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //1.获取用户名和密码
        String userCode = request.getParameter("userCode");
        String passWord = request.getParameter("password");

        //2.调用service的根据code查询用户对象的方法，方法的返回值是User对象
        AccUser accUser = passwordService.selectUserById(userCode);
        //3.判断用户是否为空，如果为空则请：1.保存错误消息  2.请求转发到login.jsp
        //如果不为空则校验密码
        if(accUser!=null){
            if(passWord.equals(accUser.getPassWord())){
                //将userInfo对象存入session
                request.getSession().setAttribute("accUser",accUser);
                //请求重定向到index.jsp
                response.sendRedirect("index.jsp");
            }else {
                //保存错误消息
                request.setAttribute("error_msg", "密码不正确");
                //请求转发到登录页面
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        }else {
            //保存错误消息
            request.setAttribute("error_msg","用户名不正确");
            //请求转发到login.jsp
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        System.out.println(request.getSession());

    }
}
