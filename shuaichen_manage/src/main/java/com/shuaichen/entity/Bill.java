package com.shuaichen.entity;


public class Bill {
    private String billId;
    private String money;
    private String checked;
    private String date;
    private String userId;
    private String deviceId;
    private DeviceInfo deviceInfo;

    public Bill() {
    }

    public Bill(String billId, String money, String checked, String userId, String deviceId, DeviceInfo deviceInfo) {
        this.billId = billId;
        this.money = money;
        this.checked = checked;
        this.userId = userId;
        this.deviceId = deviceId;
        this.deviceInfo = deviceInfo;
    }

    public Bill(String billId, String money, String checked, String date, String userId, String deviceId, DeviceInfo deviceInfo) {
        this.billId = billId;
        this.money = money;
        this.checked = checked;
        this.date = date;
        this.userId = userId;
        this.deviceId = deviceId;
        this.deviceInfo = deviceInfo;
    }

    public DeviceInfo getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }


    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "billId='" + billId + '\'' +
                ", money='" + money + '\'' +
                ", checked='" + checked + '\'' +
                ", date=" + date +
                ", userId='" + userId + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", deviceInfo=" + deviceInfo +
                '}';
    }
}

//public class Bill{
//    private String billId;
//    private String money;
//    private String checked;
//    private String date;
//    private User user;
//    private DeviceInfo deviceInfo;
//
//    public Bill() {
//    }
//
//    public Bill(String billId, String money, String checked, String date, User user, DeviceInfo deviceInfo) {
//        this.billId = billId;
//        this.money = money;
//        this.checked = checked;
//        this.date = date;
//        this.user = user;
//        this.deviceInfo = deviceInfo;
//    }
//
//    public String getBillId() {
//        return billId;
//    }
//
//    public void setBillId(String billId) {
//        this.billId = billId;
//    }
//
//    public String getMoney() {
//        return money;
//    }
//
//    public void setMoney(String money) {
//        this.money = money;
//    }
//
//    public String getChecked() {
//        return checked;
//    }
//
//    public void setChecked(String checked) {
//        this.checked = checked;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public DeviceInfo getDeviceInfo() {
//        return deviceInfo;
//    }
//
//    public void setDeviceInfo(DeviceInfo deviceInfo) {
//        this.deviceInfo = deviceInfo;
//    }
//
//    @Override
//    public String toString() {
//        return "Bill{" +
//                "billId='" + billId + '\'' +
//                ", money='" + money + '\'' +
//                ", checked='" + checked + '\'' +
//                ", date='" + date + '\'' +
//                ", user=" + user +
//                ", deviceInfo=" + deviceInfo +
//                '}';
//    }
//}

