package com.nixsolutions.bean;

public class PublishingHouse {

    private Integer publishingHouseID;
    private String publishingHouseName;

    public PublishingHouse(Integer publishingHouseID, String publishingHouseName) {
        this.publishingHouseID = publishingHouseID;
        this.publishingHouseName = publishingHouseName;
    }

    public Integer getPublishingHouseID() {
        return publishingHouseID;
    }

    public void setPublishingHouseID(Integer publishingHouseID) {
        this.publishingHouseID = publishingHouseID;
    }

    public String getPublishingHouseName() {
        return publishingHouseName;
    }

    public void setPublishingHouseName(String publishingHouseName) {
        this.publishingHouseName = publishingHouseName;
    }
}
