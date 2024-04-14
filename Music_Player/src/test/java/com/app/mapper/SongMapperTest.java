package com.app.mapper;

import com.app.entity.Song;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SongMapperTest {

    @Autowired
    private SongMapper songMapper;

    //添加歌曲
    @Test
    public void insert()
    {
        Song s=new Song();
        s.setSong_name("song3");
        s.setSong_introduction("暂无歌曲描述");
        s.setAlbum("专辑2");
        s.setSong_word_url("歌词");
        s.setTime("3.14");
        s.setType("电子曲");
        s.setUrl("song.mp3");
        s.setList_id(1);
        s.setImg_url("song_picture.jpg");
        s.setSinger_id(1);
        System.out.println("insert 执行结果:"+songMapper.insert(s));
    }

    //查询歌曲分页
    @Test
    public void find_by_song_name()
    {
        List<Song> list=songMapper.find_by_song_name("song1",0,5);

        System.out.println("find_by_song_name 执行结果:");
        for (Song s:list
             ) {
            System.out.println(s.toString());
        }
    }

    //模糊查询 分页
    @Test
    public void find_by_like_song_name()
    {
        List<Song> list=songMapper.find_by_like_song_name("song",0,5);

        System.out.println("find_by_like_song_name 执行结果:");
        for (Song s:list
        ) {
            System.out.println(s.toString());
        }
    }

    //删除歌曲
    @Test
    public void delete()
    {
        System.out.println("delete 执行结果:"+songMapper.delete_by_song_id(1));
    }

    @Test
    public void update_by_song_id()
    {
        Song s=new Song();
        s.setTime("5.00");
        //设置改变内容
        s.setSong_id(6);

        System.out.println("update 执行结果:"+songMapper.update_by_song_id(s));
    }
}
