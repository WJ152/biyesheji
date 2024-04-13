package com.app.entity;

/*
* 用户歌单字段
* table_id
* 存储用户id
* user_id
* 存储歌曲id列表
* song_list 存储歌曲id列表 使用，间隔
* 创建时间
* create_time
* 歌单描述
* introduction
* */
public class SongList {
    Integer list_id;
    Integer user_id;
    String song_list;
    String create_time;
    String introduction;

    public Integer getList_id() {
        return list_id;
    }

    public void setList_id(Integer list_id) {
        this.list_id = list_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getSong_list() {
        return song_list;
    }

    public void setSong_list(String song_list) {
        this.song_list = song_list;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
