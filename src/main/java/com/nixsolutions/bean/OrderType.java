package com.nixsolutions.bean;

public class OrderType {

    private Integer orderTypeID;
    private String orderType;

    public OrderType(Integer orderTypeID, String orderType) {
        this.orderTypeID = orderTypeID;
        this.orderType = orderType;
    }

    public Integer getOrderTypeID() {
        return orderTypeID;
    }

    public void setOrderTypeID(Integer orderTypeID) {
        this.orderTypeID = orderTypeID;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}
