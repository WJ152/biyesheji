package com.app.mapper;

import com.app.entity.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentMapperTest {
    @Autowired
    private CommentMapper commentMapper;

//    插入一条评论
    @Test
    public void insert()
    {
        Comment c=new Comment();
        c.setUser_id(1);
        c.setSong_id(1);
        c.setPublish_time(new Date().toString());
        c.setContent("真好听");
        c.setLikes(10);
        System.out.println("insert 执行情况:"+commentMapper.insert(c));
    }

//    分页查找一首歌曲的评论
    @Test
    public void find_by_song_id()
    {
        List<Comment> list=commentMapper.find_by_song_id(1,0,5);
        System.out.println("find_by_song_id 执行结果:");
        for (Comment c:list
             ) {
            System.out.println(c.toString());
        }
    }

//    更新评论
    @Test
    public void update_by_comment_id()
    {
        Comment c=new Comment();
        c.setContent("确实好听");
        c.setLikes(5);

        c.setComment_id(1);
        System.out.println("update _by_comment_id 执行结果:"+commentMapper.update_by_comment_id(c));
    }


//    删除评论
    @Test
    public void delete_by_comment_id()
    {
        System.out.println("delete_by_comment_id 执行结果:"+commentMapper.delete_by_comment_id(1));
    }
}
