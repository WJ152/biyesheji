package com.app.mapper;

import com.app.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface UserMapper {
    //添加一个用户
    Integer insert(User u);
    //根据用户id删除用户
    Integer delete_by_user_id(Integer user_id);
    //更新用户信息
    Integer update_by_user_id(User u);
    //根据用户名称查找
    User find_by_user_name(String user_name);

    //分页查找所有用户  跳过start 返回number数据
    List<User> find_part_list(Integer start,Integer number);

}
