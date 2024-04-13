package com.app.mapper;

import com.app.entity.SongList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SongListMapper {
    //插入一个歌单
    Integer insert(SongList songList);
    //根据歌单id删除
    Integer delete_by_songList_id(Integer songList_id);
    //根据用户id查找全部歌单
    List<SongList> find_by_user_id(Integer user_id);
    //根据歌单id更新
    Integer update_by_songList_id(Integer songList_id);
}
