package com.app.entity;
/*
* 歌曲字段  歌曲总是有歌唱者，专辑
* id
* 歌曲名称
* song_name
* 歌曲描述
* song_introduction
* 歌曲位置
* url
* 图片id
* img_url
* 类型
* type
* 歌词位置
* song_word_url?
* 歌手id
* singer_id
* 歌手名称
* singer_name
* 歌手专辑
* album 专辑即歌单
* 歌单id
* list_id
* */
public class Song {
    Integer song_id;
    String song_name;
    String song_introduction;

    String url;
    String img_url;
    String type;
    String song_word_url;
    Integer singer_id;
    String time;
    Integer list_id;
    String album;

    public Integer getSong_id() {
        return song_id;
    }

    public void setSong_id(Integer song_id) {
        this.song_id = song_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSong_word_url() {
        return song_word_url;
    }

    public void setSong_word_url(String song_word_url) {
        this.song_word_url = song_word_url;
    }

    public Integer getSinger_id() {
        return singer_id;
    }

    public void setSinger_id(Integer singer_id) {
        this.singer_id = singer_id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getList_id() {
        return list_id;
    }

    public void setList_id(Integer list_id) {
        this.list_id = list_id;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSong_name() {
        return song_name;
    }

    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }

    public String getSong_introduction() {
        return song_introduction;
    }

    public void setSong_introduction(String song_introduction) {
        this.song_introduction = song_introduction;
    }

    @Override
    public String toString() {
        return "Song{" +
                "song_id=" + song_id +
                ", song_name='" + song_name + '\'' +
                ", song_introduction"+song_introduction+'\''+
                ", url='" + url + '\'' +
                ", img_url='" + img_url + '\'' +
                ", type='" + type + '\'' +
                ", song_word_url='" + song_word_url + '\'' +
                ", singer_id=" + singer_id +
                ", time='" + time + '\'' +
                ", list_id=" + list_id +
                ", album='" + album + '\'' +
                '}';
    }
}
