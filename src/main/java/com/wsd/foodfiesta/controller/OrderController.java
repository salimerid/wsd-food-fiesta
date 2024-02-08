package com.wsd.foodfiesta.controller;

import com.wsd.foodfiesta.model.Order;
import com.wsd.foodfiesta.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/orders", produces = {"application/json"})
public class OrderController {
    @Autowired
    private OrderService orderService;

    //1. API to return the order list of the current day:
    @GetMapping("/orders/current-day")
    public ResponseEntity<List<Order>> getCurrentDayOrders() {
        return new ResponseEntity<>(orderService.getOrderListForCurrentDay(), HttpStatus.OK);
    }
}
