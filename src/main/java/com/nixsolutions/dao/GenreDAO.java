package com.nixsolutions.dao;

import com.nixsolutions.bean.Genre;

import java.util.List;

public interface GenreDAO {

    public int add(Genre genre);

    public void edit(Genre genre);

    public void delete(int id);

    public Genre getGere(int id);

    public List<Genre> getAllGenres();
}
