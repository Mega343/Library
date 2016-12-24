package com.nixsolutions.bean;


public class Shelf {

    private Integer shelfID;
    private Integer shelfNumber;

    public Shelf(Integer shelfID, Integer shelfNumber) {
        this.shelfID = shelfID;
        this.shelfNumber = shelfNumber;
    }

    public Integer getShelfID() {
        return shelfID;
    }

    public void setShelfID(Integer shelfID) {
        this.shelfID = shelfID;
    }

    public Integer getShelfNumber() {
        return shelfNumber;
    }

    public void setShelfNumber(Integer shelfNumber) {
        this.shelfNumber = shelfNumber;
    }
}
