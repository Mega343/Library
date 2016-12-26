package com.nixsolutions.dao;

import com.nixsolutions.bean.Shelf;

import java.util.List;

public interface ShelfDAO {

    public int add(Shelf shelf);

    public void edit(Shelf shelf);

    public void delete(Integer id);

    public Shelf getShelf(Integer id);

    public List<Shelf> getAllShelves();
}
