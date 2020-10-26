package com.fgf.controller;

import com.fgf.entity.OrderBean;
import com.fgf.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @RequestMapping("selOrder")
    public List<OrderBean> selOrder(){
        return orderService.selOrder();
    }
    @RequestMapping("deleteAll")
    public void deleteAll(@RequestParam String[] ids){
        orderService.deleteAll(ids);
    }
    @RequestMapping("insertAll")
    public void insertAll(@RequestBody OrderBean orderBean){
        orderService.insertAll(orderBean);
    }
    @RequestMapping("selOrderId")
    public OrderBean selOrderId(@RequestParam Integer ids){
        return orderService.selOrderId(ids);
    }
}
