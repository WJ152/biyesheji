package com.app.mapper;

import com.app.entity.SongList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SongListMapperTest {
    @Autowired
    private SongListMapper songListMapper;

    //插入新歌单或者专辑
    @Test
    public void insert()
    {
        SongList sl=new SongList();
        sl.setCreate_time(new Date().toString());
        sl.setSong_list("9,8,7");
        sl.setUser_id(1);
        sl.setIntroduction("没什么!");
        System.out.println("insert 执行结果:"+songListMapper.insert(sl));
    }

//    分页查找
    @Test
    public void find_by_user_id()
    {
        List<SongList> list=songListMapper.find_by_user_id(1,0,5);
        System.out.println("find_by_user_id 执行结果:");
        for (SongList sl:list
             ) {
            System.out.println(sl.toString());
        }
    }
//    更新歌单或者专辑
    @Test
    public void update_by_songList_id()
    {
        SongList sl=new SongList();
        sl.setSong_list("5,3,4,2,1");
        sl.setIntroduction("真好玩");

        sl.setList_id(2);
        System.out.println("update 执行结果:"+ songListMapper.update_by_songList_id(sl));
    }

//    删除
    @Test
    public void delete()
    {
        System.out.println("delete 执行结果:"+songListMapper.delete_by_songList_id(1));
    }

}
