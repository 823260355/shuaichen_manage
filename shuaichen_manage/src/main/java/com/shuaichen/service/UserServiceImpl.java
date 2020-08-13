package com.shuaichen.service;

import com.shuaichen.dao.UserMapper;
import com.shuaichen.entity.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User selectUserById(String id) {
        return userMapper.selectUserById(id);
    }

    @Override
    public List<User> selectUserList() {
        return userMapper.selectUserList();
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int deleteUserById(String id) {
        return userMapper.deleteUserById(id);
    }
}