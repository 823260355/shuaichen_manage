package com.shuaichen.dao;

import com.shuaichen.entity.Bill;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillMapper {
    //查看所有Bill
    List<Bill> selectBillList();

    //通过id查询Bill
    Bill selectBillByID(@Param("billId") String id);

    //通过id删除Bill
    int deleteBillByID(@Param("billId") String id);

    //增加一个Bill
    int addBill(Bill bill);

    //修改Bill
    int updateBill(Bill bill);
}
