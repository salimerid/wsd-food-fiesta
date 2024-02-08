package com.wsd.foodfiesta.repository;

import com.wsd.foodfiesta.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findById(Long customerId);
}
