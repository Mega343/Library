package com.nixsolutions.dao.impl.h2;

import com.nixsolutions.bean.OrderType;
import com.nixsolutions.dao.OrderTypeDAO;

import java.util.List;

public class H2OrderTypeDAO implements OrderTypeDAO{
    @Override
    public int add(OrderType orderType) {
        return 0;
    }

    @Override
    public void edit(OrderType orderType) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public OrderType getOrderType(Integer id) {
        return null;
    }

    @Override
    public List<OrderType> getAllOrderTypes() {
        return null;
    }
}
