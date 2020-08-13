package com.shuaichen.service;

import com.shuaichen.entity.Bill;

import java.util.List;

public interface BillService {
    //查看所有Bill
    List<Bill> selectBillList();

    //通过id查询Bill
    Bill selectBillByID(String id);

    //通过id删除Bill
    int deleteBillByID(String id);

    //增加一个Bill
    int addBill(Bill bill);

    //修改Bill
    int updateBill(Bill bill);
}
