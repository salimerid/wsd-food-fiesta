package com.wsd.foodfiesta.service;

import com.wsd.foodfiesta.model.Order;

import java.util.List;

public interface OrderService {
   List<Order> getOrderListForCurrentDay();

}
