package com.shuaichen.dao;

import com.shuaichen.entity.DeviceInfo;

import java.util.List;

public interface DeviceInfoMapper {
    //查询设备信息
    DeviceInfo selectDeviceInfoById(String deviceId);
    //所有设备信息
    List<DeviceInfo> selectDeviceInfoList();
    //添加设备
    int addDeviceInfo(DeviceInfo deviceInfo);
    //修改设备信息
    int updateDeviceInfo(DeviceInfo deviceInfo);
    //删除设备
    int deleteDeviceInfoById(String deviceId);
}
