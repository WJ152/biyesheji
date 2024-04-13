package com.app.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
* 用户功能
* 登录注册注销
* 歌单管理
*
*/

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping
    public boolean login()
    {
        return true;
    }
}
