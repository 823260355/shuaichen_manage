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

@Controller
public class UpdatePassController {
    @Autowired
    private PasswordService passwordService;
    //跳转到修改密码页面
    @RequestMapping("/toUpdatePass")
    public String toUpdatePass(){
        return "password";
    }
    //修改密码
   @RequestMapping("/UpdatePass")
    public void UpdatePass(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
      //1.判断页面两次输入密码是否一致
       String newPassword = request.getParameter("newPassword");
       String reNewPassword = request.getParameter("reNewPassword");
       //2.两次输入不一致
       if (!newPassword.equals(reNewPassword)){
           //保存错误消息
           request.setAttribute("error_msg", "两次输入密码不一致");
           //请求转发到登录页面
           request.getRequestDispatcher("password.jsp").forward(request, response);
       }else {
           String userCode = request.getParameter("userCode");
           String oldPassword = request.getParameter("oldPassword");
           //3.查询用户名和密码是否正确
           AccUser accUser = passwordService.selectUserById(userCode);
           if(accUser!=null){
               if(oldPassword.equals(accUser.getPassWord())){
                   //4.调用service的修改密码的方法
                   passwordService.updatePwd(newPassword,userCode);
                   //5.密码修改成功，请求重定向到login.jsp
                   response.sendRedirect("login.jsp");
               }else {
                   //保存错误消息
                   request.setAttribute("error_msg", "密码不正确");
                   //请求转发到登录页面
                   request.getRequestDispatcher("password.jsp").forward(request, response);
               }
           }else {
               //保存错误消息
               request.setAttribute("error_msg","用户名不正确");
               //请求转发到login.jsp
               request.getRequestDispatcher("password.jsp").forward(request, response);
           }
       }
   }
}
