package com.nixsolutions.dao;


import com.nixsolutions.bean.Order;

import java.sql.Date;
import java.util.List;

public interface OrderDAO {

    public int add(Order order);

    public void edit(Order order);

    public void delete(Long id);

    public Order getOrder(Long id);

    public List<Order> searchByOderDate(Date orderDate);

    public List<Order> searchByUser(Long id);

    public List<Order> getAllOrders();
}
