package com.zmq.entity;

/**
 * @author zmq
 * @date 2020/8/28
 * @since 1.8
 */
public class Book {
    private String bName;
    private Double bPrice;

    public Book() {
    }

    public Book(String bName, Double bPrice) {
        this.bName = bName;
        this.bPrice = bPrice;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public Double getbPrice() {
        return bPrice;
    }

    public void setbPrice(Double bPrice) {
        this.bPrice = bPrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bName='" + bName + '\'' +
                ", bPrice=" + bPrice +
                '}';
    }
}
