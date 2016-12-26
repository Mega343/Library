package com.nixsolutions.bean;

public class Street {

    private Long streetID;
    private String streetName;
    private Integer cityID;



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
