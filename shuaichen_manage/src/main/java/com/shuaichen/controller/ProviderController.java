package com.shuaichen.controller;

import com.shuaichen.entity.Provider;
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
@RequestMapping("/provider")
public class ProviderController {

    @Autowired
    @Qualifier("providerServiceImpl")
    private ProviderService providerService;

    //展示所有的供应商
    @RequestMapping("/allProviders")
    public String showAllProviders(Model model){
        List<Provider> allProviders=providerService.selectProviderList();
        model.addAttribute("allProviders",allProviders);
        return "providerList";
    }

    //跳转到添加页面
    @RequestMapping("/toAddProvider")
    public String toAddProvider(){
        return "providerAdd";
    }

    //添加页面
    @RequestMapping("/addProvider")
    public String addProvider(Provider provider,HttpServletRequest request){
        if(providerService.selectProviderById(provider.getProviderId())!=null){
            HttpSession session = request.getSession();
            session.setAttribute("isExist","输入的供应商编码已存在！");
            return "redirect:/provider/toAddProvider";
        }
        else {
            HttpSession session = request.getSession();
            session.setAttribute("isExist","");
            providerService.addProvider(provider);
            return "redirect:/provider/allProviders";
        }
    }

    //跳转到查看供应商信息页面
    @RequestMapping("/toViewProvider")
    public String toViewProvider(String id, Model model, HttpServletRequest request){
        Provider provider = providerService.selectProviderById(id);
        if(provider==null){
            HttpSession session = request.getSession();
            session.setAttribute("noResult1","查询结果不存在");
            return "redirect:/provider/allProviders";
        }
        else{
            HttpSession session = request.getSession();
            session.setAttribute("noResult1","查询正确");
            model.addAttribute("provider",provider);
            return "providerView";
        }
    }

    //跳转到修改供应商信息页面
    @RequestMapping("/toUpdateProvider")
    public String toUpdateProvider(String id,Model model){
        Provider provider = providerService.selectProviderById(id);
        model.addAttribute("provider",provider);
        return "providerUpdate";
    }

    //修改供应商信息
    @RequestMapping("/updateProvider")
    public String updateProvider(Provider provider){
        providerService.updateProvider(provider);
        return "redirect:/provider/allProviders";
    }

    //删除供应商
    @RequestMapping("/deleteProvider")
    public String deleteProvider(String id){
        providerService.deleteProviderById(id);
        return "redirect:/provider/allProviders";
    }

}
