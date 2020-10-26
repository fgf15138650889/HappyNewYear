package com.fgf.dao;

import com.fgf.entity.StaffBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StaffBeanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StaffBean record);

    int insertSelective(StaffBean record);

    StaffBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StaffBean record);

    int updateByPrimaryKey(StaffBean record);

    List<StaffBean> selStaffBean();

    void deleteStaff(String[] ids);
}