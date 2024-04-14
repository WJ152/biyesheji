package com.app.mapper;

import com.app.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    //插入一个评论
    Integer insert(Comment c);
    //分页查找一首歌曲的全部评论
    List<Comment> find_by_song_id(Integer song_id,Integer start,Integer number);
    //根据评论id删除评论
    Integer delete_by_comment_id(Integer comment_id);
    //根据评论id更新评论
    Integer update_by_comment_id(Comment comment);
}
