package com.zmq.entity;

import java.util.Date;

/**
 * @Author ZMQ
 * @Date 2020/8/26
 * @since 1.8
 * 护照实体类
 */
public class Passport {
    private int id;
    private String nationality;
    private Date expire;
    private String passenger_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getExpire() {
        return expire;
    }

    public void setExpire(Date expire) {
        this.expire = expire;
    }

    public String getPassenger_id() {
        return passenger_id;
    }

    public void setPassenger_id(String passenger_id) {
        this.passenger_id = passenger_id;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", nationality='" + nationality + '\'' +
                ", expire=" + expire +
                ", passenger_id='" + passenger_id + '\'' +
                '}';
    }
}
