package com.nixsolutions.bean;

public class Street {

    private Long streetID;
    private String streetName;
    private Integer cityID;

    public Street(Long streetID, String streetName, Integer cityID) {
        this.streetID = streetID;
        this.streetName = streetName;
        this.cityID = cityID;
    }

    public Long getStreetID() {
        return streetID;
    }

    public void setStreetID(Long streetID) {
        this.streetID = streetID;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }
}
