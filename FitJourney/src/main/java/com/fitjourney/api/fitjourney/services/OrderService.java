package com.fitjourney.api.fitjourney.services;

import com.fitjourney.api.fitjourney.models.Order;

import java.util.List;

public interface OrderService {

    List<Order> getAllOrders();
    Order getOrderById(Long id);
    Order createOrder(Order order);
    Order updateOrder(Order order);
    void deleteOrder(Long id);
}
