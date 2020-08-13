package com.shuaichen.dao;

import com.shuaichen.entity.AccUser;
import org.springframework.stereotype.Repository;

@Repository
public interface PasswordMapper {
    /**
     * 查找用户名和密码
     * @param userCode 登录用户名
     */
    AccUser selectUserById(String userCode);

    void updatePwd(String newPwd, String userCode);

    void updatePwd(AccUser accUser);
}
