package com.app.service.impl;

import com.app.entity.User;
import com.app.mapper.UserMapper;
import com.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean register(User u) {
        //先查找是否存在该用户
        if(userMapper.find_by_user_name(u.getUser_name())==null)
        {
            //返回查找结果
            return userMapper.insert(u)==1 ? true : false;
        }

        return false;
    }

    @Override
    public boolean login(User u) {
        User temp= userMapper.find_by_user_name(u.getUser_name());
        if(temp==null) {
            //不存在该用户
            return false;
        }
        else if(!temp.getPassword().equals(u.getPassword())){
            //密码错误
            return false;
        }

        return true;
    }

    @Override
    public boolean logout(User u) {
        //前提条件必定存在
        if(userMapper.delete_by_user_id(u.getUser_id())==1)
            return true;
        //删除出现异常
        return false;
    }
}
