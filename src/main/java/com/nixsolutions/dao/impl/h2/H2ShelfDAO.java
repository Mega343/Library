package com.nixsolutions.dao.impl.h2;

import com.nixsolutions.bean.Shelf;
import com.nixsolutions.dao.ShelfDAO;

import java.util.List;

public class H2ShelfDAO implements ShelfDAO {
    @Override
    public int add(Shelf shelf) {
        return 0;
    }

    @Override
    public void edit(Shelf shelf) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Shelf getShelf(Integer id) {
        return null;
    }

    @Override
    public List<Shelf> getAllShelves() {
        return null;
    }
}
