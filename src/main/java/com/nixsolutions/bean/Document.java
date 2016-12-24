package com.nixsolutions.bean;


import java.sql.Clob;
import java.sql.Date;

public class Document {

    private Integer documentID;
    private Integer documentTypeID;
    private String series;
    private Integer number;
    private String issuedBy;
    private Date dateOfIssue;
    private Clob documentImage;

    public Document(Integer documentID, Integer documentTypeID, String series, Integer number, String issuedBy, Date dateOfIssue, Clob documentImage) {
        this.documentID = documentID;
        this.documentTypeID = documentTypeID;
        this.series = series;
        this.number = number;
        this.issuedBy = issuedBy;
        this.dateOfIssue = dateOfIssue;
        this.documentImage = documentImage;
    }

    public Integer getDocumentID() {
        return documentID;
    }

    public void setDocumentID(Integer documentID) {
        this.documentID = documentID;
    }

    public Integer getDocumentTypeID() {
        return documentTypeID;
    }

    public void setDocumentTypeID(Integer documentTypeID) {
        this.documentTypeID = documentTypeID;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Clob getDocumentImage() {
        return documentImage;
    }

    public void setDocumentImage(Clob documentImage) {
        this.documentImage = documentImage;
    }
}
