package com.shuaichen.dao;

import com.shuaichen.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    //查询用户信息
    User selectUserById(@Param("userId") String id);
    //所有用户信息
    List<User> selectUserList();
    //添加用户
    int addUser(User user);
    //修改用户信息
    int updateUser(User user);
    //删除用户
    int deleteUserById(@Param("userId") String id);

}
