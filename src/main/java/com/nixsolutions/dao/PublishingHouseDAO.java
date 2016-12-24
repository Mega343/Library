package com.nixsolutions.dao;

import com.nixsolutions.bean.PublishingHouse;

import java.util.List;

public interface PublishingHouseDAO {

    public int add(PublishingHouse ph);

    public void edit(PublishingHouse ph);

    public void delete(int id);

    public PublishingHouse getPublishingHouse(int id);

    public List<PublishingHouse> getAllPublishingHouses();
}
