package com.fgf.dao;

import com.fgf.entity.OrderBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderBeanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderBean record);

    int insertSelective(OrderBean record);

    OrderBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderBean record);

    int updateByPrimaryKey(OrderBean record);

    List<OrderBean> selOrder();

    void deleteAll(String[] ids);
}