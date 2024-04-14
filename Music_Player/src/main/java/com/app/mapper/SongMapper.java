package com.app.mapper;

import com.app.entity.Song;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SongMapper {
    //插入一首歌曲
    Integer insert(Song s);
    //根据歌曲名称查找歌曲 分页
    List<Song> find_by_song_name(String song_name,Integer start,Integer number);
    //根据歌曲名称模糊查询
    List<Song> find_by_like_song_name(String song_name,Integer start,Integer number);
    //删除歌曲
    Integer delete_by_song_id(Integer song_id);
    //更新歌曲信息
    Integer update_by_song_id(Song s);

}
