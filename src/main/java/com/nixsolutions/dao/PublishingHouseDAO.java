package com.nixsolutions.dao;

import com.nixsolutions.bean.PublishingHouse;

import java.util.List;

public interface PublishingHouseDAO {

    public int add(PublishingHouse ph);

    public void edit(PublishingHouse ph);

    public void delete(Integer id);

    public PublishingHouse getPublishingHouse(Integer id);

    public List<PublishingHouse> getAllPublishingHouses();
}
