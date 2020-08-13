package com.shuaichen.controller;


import com.shuaichen.entity.Bill;
import com.shuaichen.service.BillService;
import com.shuaichen.service.DeviceInfoService;
import com.shuaichen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping("/bill")
public class BillController {
    @Autowired
    @Qualifier("billServiceImpl")
    private BillService billService;

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    @Autowired
    @Qualifier("deviceInfoServiceImpl")
    private DeviceInfoService deviceInfoService;

    //显示bill信息
    @RequestMapping("/billList")
    public String list(Model model){
            List<Bill> list = billService.selectBillList();
        for (int i = 0; i <list.size() ; i++) {
            System.out.println("###############################################3333");
            System.out.println(list.get(i));
            System.out.println("###############################################3333");

        }
            model.addAttribute("bills",list);
            return "billList";

    }


    //跳转到添加页面
    @RequestMapping("/billAdd")
    public String billAdd(){
        return "billAdd";
    }

    //添加bill信息后返回billList.jsp页面
    @RequestMapping("/afterbillAdd")
    public String afterbillAdd(Bill bill, HttpServletRequest request){
        if(billService.selectBillByID(bill.getBillId())!=null){
            HttpSession session = request.getSession();
            session.setAttribute("wrong","请检查账单编号是否重复或租户和设备是否存在！");
            return "redirect:/bill/billAdd";
        }
        else {
            String id1 = bill.getUserId();
            String id2 = bill.getDeviceId();
            if (userService.selectUserById(id1) == null) {
                HttpSession session = request.getSession();
                session.setAttribute("wrong","请检查账单编号是否重复或租户和设备是否存在！");
                return "redirect:/bill/billAdd";
            } else if (deviceInfoService.selectDeviceById(id2) == null) {
                HttpSession session = request.getSession();
                session.setAttribute("wrong","请检查账单编号是否重复或租户和设备是否存在！");
                return "redirect:/bill/billAdd";
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("wrong","");
                billService.addBill(bill);
                //重定向到billList.jsp
                return "redirect:/bill/billList";
            }
        }
    }

    //跳转到修改用户信息页面
    @RequestMapping("/billUpdate")
    public String billUpdate(String id,Model model){
        Bill bill = billService.selectBillByID(id);
        model.addAttribute("bill",bill);
        return "billUpdate";
    }
    //修改信息后返回
    @RequestMapping("/afterbillUpdate")
    public String afterbillUpdate(Bill bill,HttpServletRequest request){
        if(billService.selectBillByID(bill.getBillId())!=null){
            HttpSession session = request.getSession();
            session.setAttribute("wrong1","请检查账单编号是否重复或租户和设备是否存在！");
            return "redirect:/bill/billAdd";
        }
        else {
            String id1 = bill.getUserId();
            String id2 = bill.getDeviceId();
            if (userService.selectUserById(id1) == null) {
                HttpSession session = request.getSession();
                session.setAttribute("wrong1","请检查账单编号是否重复或租户和设备是否存在！");
                return "redirect:/bill/billAdd";
            } else if (deviceInfoService.selectDeviceById(id2) == null) {
                HttpSession session = request.getSession();
                session.setAttribute("wrong1","请检查账单编号是否重复或租户和设备是否存在！");
                return "redirect:/bill/billAdd";
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("wrong1","");
                billService.updateBill(bill);
                //重定向到billList.jsp
                return "redirect:/bill/billList";
            }
        }
    }

    //删除书籍,请使用restful风格
    @RequestMapping("/del/{billId}")
    public String billDelete(@PathVariable("billId") String id){

        billService.deleteBillByID(id);
        return "redirect:/bill/billList";
    }

    //通过id查询
    @RequestMapping("/billSelect")
    public String billSelect(String id, Model model){
        System.out.println("+++++++"+id+"++++++");
        Bill bill = billService.selectBillByID(id);
        System.out.println(bill.toString());
        model.addAttribute("bill",bill);
        return "billView";
    }

}
