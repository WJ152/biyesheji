package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
* 管理员功能
* 登录
* 用户管理->用户信息管理
* 歌曲管理->歌曲信息管理 评论管理
*
* */


@RestController
@RequestMapping("/manager")
public class ManagerController {
    //最简单路径访问测试
    @GetMapping("/")
    public String hello()
    {
        return "hello world";
    }

}
