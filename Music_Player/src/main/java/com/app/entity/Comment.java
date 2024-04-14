package com.app.entity;
/*
* 评论数据字段
* id
* 用户
* user_id
* 歌曲
* song_id
* 内容
* content
* 发布时间
* publish_time
* 点赞
* like
* */
public class Comment {
    Integer comment_id;
    Integer user_id;
    Integer song_id;
    String content;
    String publish_time;
    Integer likes;

    public Integer getComment_id() {
        return comment_id;
    }

    public void setComment_id(Integer comment_id) {
        this.comment_id = comment_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getSong_id() {
        return song_id;
    }

    public void setSong_id(Integer song_id) {
        this.song_id = song_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPublish_time() {
        return publish_time;
    }

    public void setPublish_time(String publish_time) {
        this.publish_time = publish_time;
    }

    public Integer getLike() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "comment_id=" + comment_id +
                ", user_id=" + user_id +
                ", song_id=" + song_id +
                ", content='" + content + '\'' +
                ", publish_time='" + publish_time + '\'' +
                ", likes=" + likes +
                '}';
    }
}
