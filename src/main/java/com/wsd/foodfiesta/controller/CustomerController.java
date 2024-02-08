package com.wsd.foodfiesta.controller;

import com.wsd.foodfiesta.model.Customer;
import com.wsd.foodfiesta.model.Order;
import com.wsd.foodfiesta.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/customers", produces = {"application/json"})
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    //3. API to return all the registered customer list
    @GetMapping("/v1/all")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        return new ResponseEntity<>(customerService.getAllCustomerList(), HttpStatus.OK);
    }

    //4. API to return the entire order list of a customer
    @GetMapping("/v1/{customerId}/orders")
    public ResponseEntity<List<Order>> getCustomerOrders(@PathVariable Long customerId) {
        return new ResponseEntity<>(customerService.getOrderListByCustomerId(customerId), HttpStatus.OK);
    }
}
