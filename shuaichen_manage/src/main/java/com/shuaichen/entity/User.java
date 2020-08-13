package com.shuaichen.entity;

public class User {
    private String userId;//用户编码
    private String userName;//用户名称
    private String password;//用户密码
    private String sex;//用户性别
    private String birthday;//出生日期
    private String userTelephone;//用户电话
    private String userAddress;//用户地址
    private String userType;//用户类别
    private int age;//用户年龄

    public User() {
    }

    public User(String userId, String userName, String password, String sex, String birthday, String userTelephone, String userAddress, String userType, int age) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.sex = sex;
        this.birthday = birthday;
        this.userTelephone = userTelephone;
        this.userAddress = userAddress;
        this.userType = userType;
        this.age = age;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

        public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getUserTelephone() {
        return userTelephone;
    }

    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", userTelephone='" + userTelephone + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userType='" + userType + '\'' +
                ", age=" + age +
                '}';
    }
}