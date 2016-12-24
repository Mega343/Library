package com.nixsolutions.dao.impl.h2;

import com.nixsolutions.bean.PublishingHouse;
import com.nixsolutions.dao.PublishingHouseDAO;

import java.util.List;

public class H2PublishingHouseDAO implements PublishingHouseDAO {
    @Override
    public int add(PublishingHouse ph) {
        return 0;
    }

    @Override
    public void edit(PublishingHouse ph) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public PublishingHouse getPublishingHouse(int id) {
        return null;
    }

    @Override
    public List<PublishingHouse> getAllPublishingHouses() {
        return null;
    }
}
