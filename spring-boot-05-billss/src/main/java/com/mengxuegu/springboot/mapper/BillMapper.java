package com.mengxuegu.springboot.mapper;

import com.mengxuegu.springboot.entities.Bill;
import com.mengxuegu.springboot.entities.BillProvider;
import java.util.List;

/**
 * @Author: liuwenjing
 * @Description:
 * @Date: Create in 18:59 2020/3/8
 */
public interface BillMapper {

    List<BillProvider> getBills(Bill bill);

    BillProvider getBillByBid(Integer bid);

    int addBill(Bill bill);

    int updateBill(Bill bill);

    int deteleBillByBid(Integer bid);
}
