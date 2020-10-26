package com.fgf.service.hystrix;

import com.fgf.entity.OrderBean;
import com.fgf.entity.StaffBean;
import com.fgf.service.OrderService;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class UserServiceHystrix implements OrderService {
    @Override
    public String show() {
        return "网络问题，稍后请重试";
    }

    @Override
    public List<OrderBean> selOrder() {
        return null;
    }

    @Override
    public void deleteAll(String[] ids) {

    }

    @Override
    public void insertAll(OrderBean orderBean) {

    }

    @Override
    public OrderBean selOrderId(Integer ids) {
        return null;
    }

    @Override
    public List<StaffBean> selStaffBean() {
        return null;
    }

    @Override
    public void deleteStaff(String[] ids) {

    }

    @Override
    public void insertStaff(StaffBean staffBean) {

    }

    @Override
    public StaffBean selStaffBeanId(Integer ids) {
        return null;
    }
}
