package com.app.mapper;

import com.app.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    //插入测试
    @Test
    public void insert() {
        User u = new User();
        u.setUser_name("WJ");
        u.setPassword("123465");
        u.setAge(100);
        u.setPhone("12345678901");
        u.setHobby("游戏,音乐,运动");
        u.setLast_login_time(new Date().toString());
        u.setType(3);
        u.setRegister_time(new Date().toString());
        u.setImg_url("img01.jpg");

        String singer_list = "Ami,张三,李四";
        u.setLike_singer_list(singer_list);
        u.setState(0);

        System.out.println("insert 执行结果:" + userMapper.insert(u));
    }

    //查询测试
    @Test
    public void find_by_user_name()
    {
        User u=userMapper.find_by_user_name("admin");
        System.out.println("find_by_name 执行结果:"+u.toString());
    }

    //更新测试
    @Test
    public void update_by_user_id()
    {
        User u=new User();
        u.setUser_name("admin");
        u.setPassword("123465");
        u.setAge(100);
        u.setPhone("12345678901");
        u.setHobby("游戏,音乐,运动");
        u.setLast_login_time(new Date().toString());
        u.setType(3);
        //不能修改注册时间
        u.setImg_url("img01.jpg");

        String singer_list = "Ami,张三,李四";
        u.setLike_singer_list(singer_list);
        //修改用户状态
        u.setState(1);
        //指定用户
        u.setUser_id(2);

        System.out.println("update 执行结果:"+userMapper.update_by_user_id(u));

    }


    //删除测试
    @Test
    public void delete()
    {
        System.out.println("delete 执行结果:"+userMapper.delete_by_user_id(1));
    }

    //分页查找
    @Test
    public void find_list()
    {
        List<User> users=userMapper.find_part_list(0,5);
        System.out.println("find list 执行结果:");
        for (User u: users
             ) {
            System.out.println(u.toString());
        }

    }
}
