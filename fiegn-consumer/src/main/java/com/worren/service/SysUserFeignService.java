package com.worren.service;


import com.domain.SysUser;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//@FeignClient(url="http://192.168.1.6:8091", name="provider")
@FeignClient(value="normal-provider")
public interface SysUserFeignService{

    @RequestMapping("/getList")
    List<SysUser> getList();
}
