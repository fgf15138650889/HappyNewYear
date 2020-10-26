package com.fgf.service;

import com.fgf.entity.StaffBean;

import java.util.List;

public interface StaffService {
    List<StaffBean> selStaffBean();

    void deleteStaff(String[] ids);

    void insertStaff(StaffBean staffBean);

    StaffBean selStaffBeanId(Integer ids);
}
