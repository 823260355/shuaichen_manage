package com.shuaichen.service;

import com.shuaichen.dao.PasswordMapper;
import com.shuaichen.entity.AccUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasswordServiceImpl implements PasswordService {

    @Autowired
    private PasswordMapper passwordMapper;
    @Override
    public AccUser selectUserById(String userCode) {
        return passwordMapper.selectUserById(userCode);
    }

    @Override
    public void updatePwd(String newPwd, String userCode) {
        AccUser accUser = new AccUser();
        accUser.setUserCode(userCode);
        accUser.setPassWord(newPwd);
        passwordMapper.updatePwd(accUser);
    }

}
