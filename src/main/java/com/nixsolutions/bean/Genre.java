package com.nixsolutions.bean;

public class Genre {

    private Integer genreID;
    private String genre;

    public Genre(Integer genreID, String genre) {
        this.genreID = genreID;
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getGenreID() {
        return genreID;
    }

    public void setGenreID(Integer genreID) {
        this.genreID = genreID;
    }
}
