package com.worren.web;


import com.domain.SysUser;
import com.worren.service.SysUserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SysUserController {

    @Autowired
    private SysUserFeignService sysUserService;


    @GetMapping("/getList")
    public List<SysUser> getList(){
        List<SysUser> list = sysUserService.getList();
        return list;
    }
    @GetMapping("/hello")
    public String hello(){
        return "ffff";
    }


}
