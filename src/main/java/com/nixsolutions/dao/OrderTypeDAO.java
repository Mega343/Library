package com.nixsolutions.dao;


import com.nixsolutions.bean.OrderType;

import java.util.List;

public interface OrderTypeDAO {

    public int add(OrderType orderType);

    public void edit(OrderType orderType);

    public void delete(int id);

    public OrderType getOrderType(int id);

    public List<OrderType> getAllOrderTypes();
}
