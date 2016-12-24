package com.nixsolutions.dao;

import com.nixsolutions.bean.Street;

import java.util.List;

public interface StreetDAO {

    public int add(Street street);

    public void edit(Street street);

    public void delete(int id);

    public Street getStreet(int id);

    public List<Street> getAllStreets();
}
