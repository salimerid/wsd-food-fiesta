package com.wsd.foodfiesta.service;

import com.wsd.foodfiesta.model.Customer;
import com.wsd.foodfiesta.model.Order;

import java.util.List;

public interface CustomerService {
    List<Order> getOrderListByCustomerId(Long customerId);
    List<Customer> getAllCustomerList();
}
