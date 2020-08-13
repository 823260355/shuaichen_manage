package com.shuaichen.service;

import com.shuaichen.entity.User;

import java.util.List;

public interface UserService {
    //查询用户信息
    User selectUserById(String id);
    //所有用户信息
    List<User> selectUserList();
    //添加用户
    int addUser(User user);
    //修改用户信息
    int updateUser(User user);
    //删除用户
    int deleteUserById(String id);
}
