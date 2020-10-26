package com.fgf.controller;

import com.fgf.entity.OrderBean;
import com.fgf.entity.StaffBean;
import com.fgf.pojo.ContengFing;
import com.fgf.service.OrderService;
import com.fgf.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private RedisUtil redisUtil;
    @RequestMapping("show")
    public String show(){
        return orderService.show();
    }
    @RequestMapping("selOrder")
    public List<OrderBean> selOrder(){
        List<OrderBean> list= (List<OrderBean>) redisUtil.get(ContengFing.ORDER_LIST_KEY);
       if(list==null||list.isEmpty()){
           list=orderService.selOrder();
           redisUtil.set(ContengFing.ORDER_LIST_KEY,list);
           redisUtil.expire(ContengFing.ORDER_LIST_KEY,60);
       }
        return list;
    }
    @RequestMapping("deleteAll")
    public void deleteAll(String[] ids){

        orderService.deleteAll(ids);
        redisUtil.delAllKeys(ContengFing.ORDER_LIST_KEY);
    }
    @RequestMapping("insertAll")
    public void insertAll(OrderBean orderBean){
        orderService.insertAll(orderBean);
        redisUtil.delAllKeys(ContengFing.ORDER_LIST_KEY);
    }
    @RequestMapping("selOrderId")
    public OrderBean selorderId(Integer ids){
        return orderService.selOrderId(ids);
    }



    @RequestMapping("selStaffBean")
    public List<StaffBean> selStaffBean(){
        List<StaffBean>  slist= (List<StaffBean>) redisUtil.get(ContengFing.STAFF_LIST_KEY);
        if(slist==null||slist.isEmpty()){
            slist=orderService.selStaffBean();
            redisUtil.set(ContengFing.STAFF_LIST_KEY,slist);
            redisUtil.expire(ContengFing.STAFF_LIST_KEY,60);
        }
        return slist;
    }
    @RequestMapping("deleteStaff")
    public void deleteStaff(String[] ids){
        orderService.deleteStaff(ids);
        redisUtil.delAllKeys(ContengFing.STAFF_LIST_KEY);
    }
    @RequestMapping("insertStaff")
    public void insertStaff(StaffBean staffBean){
        orderService.insertStaff(staffBean);
        redisUtil.delAllKeys(ContengFing.STAFF_LIST_KEY);
    }
    @RequestMapping("selStaffBeanId")
    public StaffBean selStaffBeanId(Integer ids){
        return orderService.selStaffBeanId(ids);

    }
}
