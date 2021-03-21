package com.worren.controller;


import com.domain.SysUser;
import com.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @ResponseBody
    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }

    @ResponseBody
    @GetMapping("/getList")
    public List<SysUser> getList(){
        List<SysUser> list = sysUserService.getList();
        return list;
    }


}
