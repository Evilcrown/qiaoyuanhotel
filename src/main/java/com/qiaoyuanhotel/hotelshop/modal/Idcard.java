package com.qiaoyuanhotel.hotelshop.modal;

import java.io.Serializable;

public class Idcard implements Serializable {
    private String idNum;

    private String name;

    private Short sex;

    private String address;

    private Short nation;

    private static final long serialVersionUID = 1L;

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum == null ? null : idNum.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Short getSex() {
        return sex;
    }

    public void setSex(Short sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Short getNation() {
        return nation;
    }

    public void setNation(Short nation) {
        this.nation = nation;
    }
}