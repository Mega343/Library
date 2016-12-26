package com.nixsolutions.dao;

import com.nixsolutions.bean.City;

import java.util.List;

public interface CityDAO {

    public int add(City city);

    public void edit(City city);

    public void delete(Integer id);

    public City getCity(Integer id);

    public List<City> getAllCities();
}
