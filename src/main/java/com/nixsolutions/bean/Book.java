package com.nixsolutions.bean;

public class Book {

    private Long bookID;
    private String bookName;
    private Integer authorID;
    private Integer publishingHouseID;
    private Integer genreID;
    private Integer yearOfIssue;
    private Integer languageID;
    private String bookDescription;
    private Integer bookQuantity;
    private Integer bookInWarehouse;
    private Integer shelfID;
    private Integer bookRate;
    private Integer numberOfReadings;


    public Long getBookID() {
        return bookID;
    }

    public void setBookID(Long bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getAuthorID() {
        return authorID;
    }

    public void setAuthorID(Integer authorID) {
        this.authorID = authorID;
    }

    public Integer getPublishingHouseID() {
        return publishingHouseID;
    }

    public void setPublishingHouseID(Integer publishingHouseID) {
        this.publishingHouseID = publishingHouseID;
    }

    public Integer getGenreID() {
        return genreID;
    }

    public void setGenreID(Integer genreID) {
        this.genreID = genreID;
    }

    public Integer getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(Integer yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public Integer getLanguageID() {
        return languageID;
    }

    public void setLanguageID(Integer languageID) {
        this.languageID = languageID;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public Integer getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(Integer bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

    public Integer getBookInWarehouse() {
        return bookInWarehouse;
    }

    public void setBookInWarehouse(Integer bookInWarehouse) {
        this.bookInWarehouse = bookInWarehouse;
    }

    public Integer getShelfID() {
        return shelfID;
    }

    public void setShelfID(Integer shelfID) {
        this.shelfID = shelfID;
    }

    public Integer getBookRate() {
        return bookRate;
    }

    public void setBookRate(Integer bookRate) {
        this.bookRate = bookRate;
    }

    public Integer getNumberOfReadings() {
        return numberOfReadings;
    }

    public void setNumberOfReadings(Integer numberOfReadings) {
        this.numberOfReadings = numberOfReadings;
    }
}
