package com.nixsolutions.dao.impl.h2;

import com.nixsolutions.bean.City;
import com.nixsolutions.dao.CityDAO;

import java.util.List;

public class H2CityDAO implements CityDAO {
    @Override
    public int add(City city) {
        return 0;
    }

    @Override
    public void edit(City city) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public City getCity(int id) {
        return null;
    }

    @Override
    public List<City> getAllCities() {
        return null;
    }
}
