package com.nixsolutions.dao.impl.h2;

import com.nixsolutions.bean.Genre;
import com.nixsolutions.dao.GenreDAO;

import java.util.List;

public class H2GenreDAO implements GenreDAO {
    @Override
    public int add(Genre genre) {
        return 0;
    }

    @Override
    public void edit(Genre genre) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Genre getGenre(Integer id) {
        return null;
    }

    @Override
    public List<Genre> getAllGenres() {
        return null;
    }
}
