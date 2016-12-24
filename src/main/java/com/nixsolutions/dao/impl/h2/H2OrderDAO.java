package com.nixsolutions.dao.impl.h2;

import com.nixsolutions.bean.Order;
import com.nixsolutions.dao.OrderDAO;

import java.sql.Date;
import java.util.List;

public class H2OrderDAO implements OrderDAO {
    @Override
    public int add(Order order) {
        return 0;
    }

    @Override
    public void edit(Order order) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Order getOrder(int id) {
        return null;
    }

    @Override
    public List<Order> searchByOderDate(Date orderDate) {
        return null;
    }

    @Override
    public List<Order> searchByUser(int id) {
        return null;
    }

    @Override
    public List<Order> getAllOrders() {
        return null;
    }
}
