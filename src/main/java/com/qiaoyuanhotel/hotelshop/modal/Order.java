package com.qiaoyuanhotel.hotelshop.modal;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    private Integer orderid;

    private Date reservationtime;

    private Short payment;

    private Integer roominfa;

    private Short user;

    private static final long serialVersionUID = 1L;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Date getReservationtime() {
        return reservationtime;
    }

    public void setReservationtime(Date reservationtime) {
        this.reservationtime = reservationtime;
    }

    public Short getPayment() {
        return payment;
    }

    public void setPayment(Short payment) {
        this.payment = payment;
    }

    public Integer getRoominfa() {
        return roominfa;
    }

    public void setRoominfa(Integer roominfa) {
        this.roominfa = roominfa;
    }

    public Short getUser() {
        return user;
    }

    public void setUser(Short user) {
        this.user = user;
    }
}