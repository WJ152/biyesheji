package com.app.service;

import com.app.entity.User;
public interface UserService {
    //注册
    boolean register(User u);
    //登录
    boolean login(User u);
    //注销
    boolean logout(User u);

}
