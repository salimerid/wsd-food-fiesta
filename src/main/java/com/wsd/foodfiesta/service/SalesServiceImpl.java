package com.wsd.foodfiesta.service;

import com.wsd.foodfiesta.model.Order;
import com.wsd.foodfiesta.repository.OrderRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
@Log4j2
public class SalesServiceImpl implements SalesService{

    @Autowired
    private OrderRepository orderRepository;
    @Override
    public BigDecimal getTotalSaleAmountForCurrentDay() {
        List<Order> orders = orderRepository.findByOrderDate(LocalDate.now());
        log.info("start calculate totalSaleAmount ");
        //return orders.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
        return BigDecimal.ZERO;
    }

    @Override
    public LocalDate getMaxSaleDay(LocalDate startDate, LocalDate endDate) {
        List<Order> orders = orderRepository.findBySaleDateBetween(startDate, endDate);

        return null;
    }
}
