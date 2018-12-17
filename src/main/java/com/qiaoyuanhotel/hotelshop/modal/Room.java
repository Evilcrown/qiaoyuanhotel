package com.qiaoyuanhotel.hotelshop.modal;

import java.io.Serializable;
import java.math.BigDecimal;

public class Room implements Serializable {
    private Short roomNum;

    private Short roomType;

    private BigDecimal defaultPrice;

    private static final long serialVersionUID = 1L;

    public Short getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(Short roomNum) {
        this.roomNum = roomNum;
    }

    public Short getRoomType() {
        return roomType;
    }

    public void setRoomType(Short roomType) {
        this.roomType = roomType;
    }

    public BigDecimal getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(BigDecimal defaultPrice) {
        this.defaultPrice = defaultPrice;
    }
}