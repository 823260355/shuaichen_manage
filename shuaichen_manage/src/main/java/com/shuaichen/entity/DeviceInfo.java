package com.shuaichen.entity;

public class DeviceInfo {
    private String deviceId; //设备编号
    private String deviceName;//设备名称
    private int deviceNum; //设备数量
    private String deviceMoney; //设备单价
    private String deviceType; //设备类型
    private Provider provider; //供应商信息（外键）

    public DeviceInfo() {

    }

    public DeviceInfo(String deviceId, String deviceName, int deviceNum, String deviceMoney, String deviceType, Provider provider) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.deviceNum = deviceNum;
        this.deviceMoney = deviceMoney;
        this.deviceType = deviceType;
        this.provider = provider;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public int getDeviceNum() {
        return deviceNum;
    }

    public void setDeviceNum(int deviceNum) {
        this.deviceNum = deviceNum;
    }

    public String getDeviceMoney() {
        return deviceMoney;
    }

    public void setDeviceMoney(String deviceMoney) {
        this.deviceMoney = deviceMoney;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    @Override
    public String toString() {
        return "DeviceInfo{" +
                "deviceId='" + deviceId + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", deviceNum=" + deviceNum +
                ", deviceMoney='" + deviceMoney + '\'' +
                ", deviceType='" + deviceType + '\'' +
                ", provider=" + provider +
                '}';
    }
}
