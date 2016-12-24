package com.nixsolutions.bean;

public class Address {

    private Long address_id;
    private String houseNumber;
    private String flatNumber;

    public Address(Long address_id, String houseNumber, String flatNumber) {
        this.address_id = address_id;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }

    public Long getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Long address_id) {
        this.address_id = address_id;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }
}
