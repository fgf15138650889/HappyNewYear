package com.fgf.service;

import com.fgf.entity.OrderBean;
import com.fgf.entity.StaffBean;
import com.fgf.service.hystrix.UserServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value="springcloud-provider" ,fallback = UserServiceHystrix.class)
public interface OrderService {
    @RequestMapping("show")
    public String show();
    @RequestMapping("selOrder")
    public List<OrderBean> selOrder();
    @RequestMapping("deleteAll")
    public void deleteAll(@RequestParam String[] ids);
    @RequestMapping("insertAll")
    public void insertAll(@RequestBody OrderBean orderBean);
    @RequestMapping("selOrderId")
    public OrderBean selOrderId(@RequestParam Integer ids);
    @RequestMapping("selStaffBean")
    public List<StaffBean> selStaffBean();
    @RequestMapping("deleteStaff")
    public void deleteStaff(@RequestParam String[] ids);
    @RequestMapping("insertStaff")
    public void insertStaff(@RequestBody StaffBean staffBean);
    @RequestMapping("selStaffBeanId")
    public StaffBean selStaffBeanId(@RequestParam Integer ids);
}
