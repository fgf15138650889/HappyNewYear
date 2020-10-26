package com.fgf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {


    @RequestMapping("toshow")
    public String toshow(){
        return "show";
    }
    @RequestMapping("toshow1")
    public String toshow1(){
        return "show1";
    }


}
