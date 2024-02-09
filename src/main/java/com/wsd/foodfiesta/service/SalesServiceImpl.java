package com.wsd.foodfiesta.service;

import com.wsd.foodfiesta.model.Order;
import com.wsd.foodfiesta.repository.OrderRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

@Service
@Log4j2
public class SalesServiceImpl implements SalesService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public BigDecimal getTotalSaleAmountForCurrentDay() {
        List<Order> orders = orderRepository.findByOrderDate(LocalDate.now());
        BigDecimal totalSaleAmount = orders.stream().map(Order::getSaleAmount).reduce(BigDecimal.ZERO, BigDecimal::add);
        log.info("Get total sale amount for current day :: " + totalSaleAmount);
        return totalSaleAmount;
    }

    @Override
    public LocalDate getMaxSaleDay(LocalDate startDate, LocalDate endDate) {
        List<Order> orders = orderRepository.findBySaleDateBetween(startDate, endDate);

        if (orders != null) {
            Order maxSaleInDateRange = orders.stream()
                    .max(Comparator.comparingDouble(sale -> sale.getSaleAmount().doubleValue()))
                    .orElse(null);

            //        Order maxSaleInDateRange = orders.stream()
            //                .filter(sale -> sale.getSaleDate().isEqual(startDate) || sale.getSaleDate().isEqual(endDate) || (sale.getSaleDate().isAfter(startDate) && sale.getSaleDate().isBefore(endDate)))
            //                .max(Comparator.comparingDouble(sale -> sale.getSaleAmount().doubleValue()))
            //                .orElse(null);

            if (maxSaleInDateRange != null) {
                log.info("Max Sale day : " + maxSaleInDateRange.getSaleDate() + " amount is : " + maxSaleInDateRange.getSaleAmount());
                return maxSaleInDateRange.getSaleDate();
            } else {
                log.info("No sales data available for the specified date range.");
                return null;
            }
        } else {
            log.info("No sales data available for the specified date range.");
            return null;
        }

    }
}
