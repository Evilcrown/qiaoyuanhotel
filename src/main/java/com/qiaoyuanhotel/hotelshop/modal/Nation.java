package com.qiaoyuanhotel.hotelshop.modal;

import java.io.Serializable;

public class Nation implements Serializable {
    private Short id;

    private String name;

    private static final long serialVersionUID = 1L;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}