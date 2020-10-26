package com.fgf.service.impl;

import com.fgf.dao.OrderBeanMapper;
import com.fgf.entity.OrderBean;
import com.fgf.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderBeanMapper orderBeanMapper;

    @Override
    public List<OrderBean> selOrder() {
        return orderBeanMapper.selOrder();
    }

    @Override
    public void deleteAll(String[] ids) {
        orderBeanMapper.deleteAll(ids);
    }

    @Override
    public void insertAll(OrderBean orderBean) {
        if(orderBean.getId()==null){
            orderBeanMapper.insert(orderBean);
        }else{
            orderBeanMapper.updateByPrimaryKey(orderBean);
        }

    }

    @Override
    public OrderBean selOrderId(Integer ids) {
        return orderBeanMapper.selectByPrimaryKey(ids);
    }
}
