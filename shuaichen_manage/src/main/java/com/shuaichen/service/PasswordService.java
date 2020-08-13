package com.shuaichen.service;

import com.shuaichen.entity.AccUser;


public interface PasswordService {
     //查询用户密码：根据输出用户名（userCode）返回用户信息
     AccUser selectUserById(String userCode);
     //更新用户密码
     void updatePwd(String newPwd, String userCode);
}
