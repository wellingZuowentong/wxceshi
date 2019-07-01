package com.example.savename.bean;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 作者：王怀朋
 * 日期：2019/6/27
 */
public class SaveName {
    private Integer id;
    private String username;
    private String gender;
    private String gongzuo;
    private String phone;
    private Date ostatytime;

    public SaveName() {}

    public SaveName(Integer id, String username, String gender, String gongzuo, String phone, Date ostatytime) {
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.gongzuo = gongzuo;
        this.phone = phone;
        this.ostatytime = ostatytime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGongzuo() {
        return gongzuo;
    }

    public void setGongzuo(String gongzuo) {
        this.gongzuo = gongzuo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getOstatytime() {
        return ostatytime;
    }

    public void setOstatytime(Date ostatytime) {
        this.ostatytime = ostatytime;
    }

    @Override
    public String toString() {
        return "SaveName{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                ", gongzuo='" + gongzuo + '\'' +
                ", phone='" + phone + '\'' +
                ", ostatytime=" + ostatytime +
                '}';
    }
}
