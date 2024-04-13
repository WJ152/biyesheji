package com.app.mapper;

import com.app.entity.Song;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SongMapper {
    //插入一首歌曲
    Integer insert(Song s);
    //根据歌手id查找全部歌曲
    List<Song> find_by_singer_id(Integer singer_id);
    //根据歌曲id查找歌曲
    Song find_by_song_id(Integer song_id);

}
