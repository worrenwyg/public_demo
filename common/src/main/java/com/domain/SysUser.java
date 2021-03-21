package com.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUser {

    private long id;

    private String username;

    private String nickname;

    private String password;

    private String remarks;

}
