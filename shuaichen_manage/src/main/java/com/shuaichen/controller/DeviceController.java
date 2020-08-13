package com.shuaichen.controller;

import com.shuaichen.entity.DeviceInfo;
import com.shuaichen.entity.Provider;
import com.shuaichen.service.DeviceInfoService;
import com.shuaichen.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class DeviceController {
    @Autowired
    @Qualifier("deviceInfoServiceImpl")
    private DeviceInfoService deviceInfoService;

    @Autowired
    @Qualifier("providerServiceImpl")
    private ProviderService providerService;
    //查询设备列表信息
    @RequestMapping("/deviceList")
    public String deviceList(Model model) {
        //1.调用service的查询设备列表的方法，返回值类型是List<User>
        List<DeviceInfo> devices = deviceInfoService.selectDeviceInfoList();
        //2.保存信息列表
          model.addAttribute("devices", devices);
        //3.转发到deviceList.jsp
       return "deviceList";
    }
    //跳转到添加页面
    @RequestMapping("/toAddDeviceInfo")
    public String toAddProvider(){
        return "deviceAdd";
    }
    //添加页面
    @RequestMapping("/deviceAdd")
    public String billAdd(DeviceInfo deviceInfo, HttpServletRequest request){
        if(deviceInfoService.selectDeviceById(deviceInfo.getDeviceId())!=null){
            HttpSession session = request.getSession();
            session.setAttribute("wrong3","请检查设备编号是否重复或者该供应商是否存在！");
            return "redirect:/toAddDeviceInfo";
        }else if(providerService.selectProviderById(deviceInfo.getProvider().getProviderId())==null){
            HttpSession session = request.getSession();
            session.setAttribute("wrong3","请检查设备编号是否重复或者该供应商是否存在！");
            return "redirect:/toAddDeviceInfo";
        }
        else {
            HttpSession session = request.getSession();
            session.setAttribute("wrong3","");
            deviceInfoService.addDeviceInfo(deviceInfo);
            return "redirect:deviceList";
        }
    }

    //跳转到查看设备信息页面
    @RequestMapping("/deviceView")
    public String toViewProvider(String deviceId, Model model){
        DeviceInfo deviceInfo= deviceInfoService.selectDeviceById(deviceId);
        model.addAttribute("deviceInfo",deviceInfo );
        return "deviceView";
    }

    //跳转到修改设备信息页面
    @RequestMapping("/toDeviceUpdate")
    public String toDeviceUpdate(String deviceId, Model model){
        DeviceInfo deviceInfo= deviceInfoService.selectDeviceById(deviceId);
        model.addAttribute("deviceInfo",deviceInfo);
        return "deviceUpdate";
    }

    //修改设备信息
    @RequestMapping("/deviceUpdate")
    public String updateProvider(DeviceInfo deviceInfo,HttpServletRequest request){
        if (providerService.selectProviderById(deviceInfo.getProvider().getProviderId())==null){
            HttpSession session = request.getSession();
            session.setAttribute("wrong4","请检查该供应商是否存在！");
            return "redirect:/toDeviceUpdate";
        }else {
            HttpSession session = request.getSession();
            session.setAttribute("wrong4","");
            deviceInfoService.updateDeviceInfo(deviceInfo);
            return "redirect:deviceList";
        }
    }

    //删除设备信息
    @RequestMapping("/deleteDeviceInfo")
    public String deleteDeviceInfo(String deviceId){
        deviceInfoService.deleteDeviceInfoById(deviceId);
        return "redirect:deviceList";
    }

}
