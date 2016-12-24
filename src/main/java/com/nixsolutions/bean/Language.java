package com.nixsolutions.bean;

public class Language {

    private Integer languageID;
    private String language;

    public Language(Integer languageID, String language) {
        this.languageID = languageID;
        this.language = language;
    }

    public Integer getLanguageID() {
        return languageID;
    }

    public void setLanguageID(Integer languageID) {
        this.languageID = languageID;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
