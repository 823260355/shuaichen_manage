package com.shuaichen.service;

import com.shuaichen.dao.BillMapper;
import com.shuaichen.entity.Bill;

import java.util.List;

public class BillServiceImpl implements BillService{
    private BillMapper billMapper;

    @Override
    public List<Bill> selectBillList() {
        return billMapper.selectBillList();
    }

    @Override
    public Bill selectBillByID(String id) {
        return billMapper.selectBillByID(id);
    }

    @Override
    public int deleteBillByID(String id) {
        return billMapper.deleteBillByID(id);
    }

    @Override
    public int addBill(Bill bill) {
        return billMapper.addBill(bill);
    }

    @Override
    public int updateBill(Bill bill) {
        return billMapper.updateBill(bill);
    }

    public void setBillMapper(BillMapper billMapper) {
        this.billMapper=billMapper;
    }
}
