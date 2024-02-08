package com.wsd.foodfiesta.service;

import com.wsd.foodfiesta.model.Customer;
import com.wsd.foodfiesta.model.Order;
import com.wsd.foodfiesta.repository.OrderRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@Log4j2
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;
    @Override
    public List<Order> getOrderListForCurrentDay() {
        return orderRepository.findByOrderDate(LocalDate.now());
    }

    @Override
    public List<Order> findByCustomer(Customer customer) {
        return null;
    }
}
