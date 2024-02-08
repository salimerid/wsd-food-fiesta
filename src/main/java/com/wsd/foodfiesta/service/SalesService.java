package com.wsd.foodfiesta.service;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface SalesService {
    BigDecimal getTotalSaleAmountForCurrentDay();
    LocalDate getMaxSaleDay(LocalDate startDate, LocalDate endDate);
}
