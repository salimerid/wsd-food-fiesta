package com.wsd.foodfiesta.controller;

import com.wsd.foodfiesta.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;

@RestController
@RequestMapping("/api/sales")
public class SalesController {

    @Autowired
    private SalesService salesService;

    //2. API to return the total sale amount of the current day:
    @GetMapping("/v1/total-current-day")
    public ResponseEntity<BigDecimal> getTotalSaleAmountCurrentDay() {
        return new ResponseEntity<>(salesService.getTotalSaleAmountForCurrentDay(), HttpStatus.OK);
    }

    //5. API to return the max sale day of a certain time range:
    @GetMapping("/v1/max-sale-day")
    public ResponseEntity<LocalDate> getMaxSaleDay(@RequestParam LocalDate startDate, @RequestParam LocalDate endDate) {
        return new ResponseEntity<>(salesService.getMaxSaleDay(startDate, endDate), HttpStatus.OK);
    }
}
