package com.shuaichen.entity;

/**
 * 开发员：李媛
 * 登录用户类：AccUser
 */
public class AccUser {
    private int id;  //编号
    private String userCode;  //用户名
    private String passWord;  //用户密码

    public AccUser() {

    }

    public AccUser(int id, String userCode, String passWord) {
        this.id = id;
        this.userCode = userCode;
        this.passWord = passWord;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "AccUser{" +
                "id=" + id +
                ", userCode='" + userCode + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
