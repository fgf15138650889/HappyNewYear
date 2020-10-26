package com.fgf.service;

import com.fgf.entity.OrderBean;

import java.util.List;

public interface OrderService {
    List<OrderBean> selOrder();

    void deleteAll(String[] ids);

    void insertAll(OrderBean orderBean);

    OrderBean selOrderId(Integer ids);
}
