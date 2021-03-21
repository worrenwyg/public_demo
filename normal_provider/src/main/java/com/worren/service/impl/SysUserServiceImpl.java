package com.worren.service.impl;


import com.domain.SysUser;
import com.worren.dao.SysUserMapper;
import com.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> getList(){
        return sysUserMapper.getList();
    }

}
