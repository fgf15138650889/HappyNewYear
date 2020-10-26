package com.fgf.controller;

import com.fgf.entity.StaffBean;
import com.fgf.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StaffController {
    @Autowired
    private StaffService staffService;
    @RequestMapping("selStaffBean")
    public List<StaffBean> selStaffBean(){
        return staffService.selStaffBean();
    }
    @RequestMapping("deleteStaff")
    public void deleteStaff(@RequestParam String[] ids){
        staffService.deleteStaff(ids);
    }
    @RequestMapping("insertStaff")
    public void insertStaff(@RequestBody StaffBean staffBean){
        staffService.insertStaff(staffBean);
    }
    @RequestMapping("selStaffBeanId")
    public StaffBean selStaffBeanId(@RequestParam Integer ids){
        return staffService.selStaffBeanId(ids);
    }
}
