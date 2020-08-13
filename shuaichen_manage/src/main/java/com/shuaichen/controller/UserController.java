package com.shuaichen.controller;

import com.shuaichen.entity.User;
import com.shuaichen.service.BillService;
import com.shuaichen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    @Autowired
    @Qualifier("billServiceImpl")
    private BillService billService;

    //展示所有的用户
    @RequestMapping("/allUsers")
    public String showAllUsers(Model model){
        List<User> allUsers = userService.selectUserList();
        model.addAttribute("allUsers",allUsers);
        return "userList";
    }

    //跳转到添加用户页面
    @RequestMapping("/toAddUser")
    public String toAddUser(){
        return "userAdd";
    }

    //添加用户
    @RequestMapping("/addUser")
    public String addUser(User user, HttpServletRequest request){
        if(userService.selectUserById(user.getUserId())!=null){
            HttpSession session = request.getSession();
            session.setAttribute("wrong2","请检查用户编号是否重复或两次密码输入是否一致！");
            return "redirect:/user/toAddUser";
        }else{
            String password1 = request.getParameter("password");
            String password2 = request.getParameter("userRemi");
            if(password1.equals(password2)){
                HttpSession session = request.getSession();
                session.setAttribute("wrong2","");
                userService.addUser(user);
                return "redirect:/user/allUsers";
            }
            else {
                //获取session
                HttpSession session = request.getSession();
                session.setAttribute("wrong2","请检查用户编号是否重复或两次密码输入是否一致！");
                return "redirect:/user/toAddUser";
            }
        }

    }

    //跳转到查看用户信息页面
    @RequestMapping("/toViewUser")
    public String toViewUser(String id,Model model,HttpServletRequest request){
        User user = userService.selectUserById(id);
        if(user==null){
            HttpSession session = request.getSession();
            session.setAttribute("noResult","查询结果不存在");
            return "redirect:/user/allUsers";
        }
        else{
            HttpSession session = request.getSession();
            session.setAttribute("noResult","查询正确");
            model.addAttribute("user",user);
            return "userView";
        }

    }

    //跳转到修改用户信息页面
    @RequestMapping("/toUpdateUser")
    public String toUpdateUser(String id,Model model){
        User user = userService.selectUserById(id);
        model.addAttribute("user",user);
        return "userUpdate";
    }

    //修改用户信息
    @RequestMapping("/updateUser")
    public String updateUser(User user){
        userService.updateUser(user);
        return "redirect:/user/allUsers";
    }

    //删除用户
    @RequestMapping("/deleteUser")
    public String deleteUser(String id){
        userService.deleteUserById(id);
        return "redirect:/user/allUsers";
    }
}