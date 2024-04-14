package com.app.entity;
/*
* 用户数据字段    ->歌手 管理员
* id
* 称呼
* name
* 密码
* password
* 电话
* phone
* 年龄
* age
* 上次登录时间
* last_login_time
* 注册时间
* register_time
* 头像
* img_url
* 偏好
* hobby
* 喜欢的歌手列表
* like_singer_list
* 权限
* state
* 类型 一般用户 管理员 歌手
* type
* */
public class User {
    Integer user_id;
    String user_name;
    String password;
    Integer age;
    String phone;
    String last_login_time;
    String register_time;
    String img_url;
    String hobby;
    String like_singer_list;
    Integer state;
    Integer type;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLast_login_time() {
        return last_login_time;
    }

    public void setLast_login_time(String last_login_time) {
        this.last_login_time = last_login_time;
    }

    public String getRegister_time() {
        return register_time;
    }

    public void setRegister_time(String register_time) {
        this.register_time = register_time;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getLike_singer_list() {
        return like_singer_list;
    }

    public void setLike_singer_list(String like_singer_list) {
        this.like_singer_list = like_singer_list;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", last_login_time='" + last_login_time + '\'' +
                ", register_time='" + register_time + '\'' +
                ", img_url='" + img_url + '\'' +
                ", hobby='" + hobby + '\'' +
                ", like_singer_list='" + like_singer_list + '\'' +
                ", state=" + state +
                ", type=" + type +
                '}';
    }
}
