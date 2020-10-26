package com.fgf.service.impl;

import com.fgf.dao.StaffBeanMapper;
import com.fgf.entity.StaffBean;
import com.fgf.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffBeanMapper staffBeanMapper;

    @Override
    public List<StaffBean> selStaffBean() {
        return staffBeanMapper.selStaffBean();
    }

    @Override
    public void deleteStaff(String[] ids) {
        staffBeanMapper.deleteStaff(ids);
    }

    @Override
    public void insertStaff(StaffBean staffBean) {
        if(staffBean.getId()==null){
            staffBeanMapper.insert(staffBean);
        }else{
            staffBeanMapper.updateByPrimaryKey(staffBean);
        }

    }

    @Override
    public StaffBean selStaffBeanId(Integer ids) {
        return staffBeanMapper.selectByPrimaryKey(ids);
    }
}
