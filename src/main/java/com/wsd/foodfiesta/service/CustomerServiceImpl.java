package com.wsd.foodfiesta.service;

import com.wsd.foodfiesta.model.Customer;
import com.wsd.foodfiesta.model.Order;
import com.wsd.foodfiesta.repository.CustomerRepository;
import com.wsd.foodfiesta.repository.OrderRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    OrderRepository orderRepository;

    @Override
    public List<Order> getOrderListByCustomerId(Long customerId) {
        log.info("Getting customer customerId: {}", customerId);
        Customer customer = customerRepository.findById(customerId).get();
        return orderRepository.findByCustomer(customer);
    }

    @Override
    public List<Customer> getAllCustomerList() {
        log.info("Getting all customers");
        return customerRepository.findAll();
    }
}
