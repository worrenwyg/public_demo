package com.worren.dao;


import com.domain.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface SysUserMapper {

    @Select("select * from sys_user")
    List<SysUser> getList();
}
