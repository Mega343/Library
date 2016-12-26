package com.nixsolutions.bean;

import java.sql.Date;
import java.sql.Timestamp;

public class Order {

    private Long orderID;
    private Long userID;
    private Long librarianID;
    private Long bookID;
    private Timestamp orderDate;
    private Date expectedReturnDate;
    private Date actualReturnDate;
    private Integer orderTypeID;


    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public Long getLibrarianID() {
        return librarianID;
    }

    public void setLibrarianID(Long librarianID) {
        this.librarianID = librarianID;
    }

    public Long getBookID() {
        return bookID;
    }

    public void setBookID(Long bookID) {
        this.bookID = bookID;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public Date getExpectedReturnDate() {
        return expectedReturnDate;
    }

    public void setExpectedReturnDate(Date expectedReturnDate) {
        this.expectedReturnDate = expectedReturnDate;
    }

    public Date getActualReturnDate() {
        return actualReturnDate;
    }

    public void setActualReturnDate(Date actualReturnDate) {
        this.actualReturnDate = actualReturnDate;
    }

    public Integer getOrderTypeID() {
        return orderTypeID;
    }

    public void setOrderTypeID(Integer orderTypeID) {
        this.orderTypeID = orderTypeID;
    }
}
