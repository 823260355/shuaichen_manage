package com.shuaichen.service;

import com.shuaichen.dao.DeviceInfoMapper;
import com.shuaichen.entity.DeviceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceInfoServiceImpl implements DeviceInfoService {
    @Autowired
    private DeviceInfoMapper deviceInfoMapper;
    //根据设备名查看设备信息
    @Override
    public DeviceInfo selectDeviceById(String deviceId) {
        return deviceInfoMapper.selectDeviceInfoById(deviceId);
    }
    //查询设备信息列表
    @Override
    public List<DeviceInfo> selectDeviceInfoList() {
        return deviceInfoMapper.selectDeviceInfoList();
    }
    //新增设备信息
    @Override
    public int addDeviceInfo(DeviceInfo deviceInfo) {
        return deviceInfoMapper.addDeviceInfo(deviceInfo);
    }
    //更新设备信息
    @Override
    public int updateDeviceInfo(DeviceInfo deviceInfo) {
        return deviceInfoMapper.updateDeviceInfo(deviceInfo);
    }
    //删除设备信息
    @Override
    public int deleteDeviceInfoById(String deviceId) {
        return deviceInfoMapper.deleteDeviceInfoById(deviceId);
    }
}
