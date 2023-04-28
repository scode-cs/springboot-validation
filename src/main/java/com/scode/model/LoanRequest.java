package com.scode.model;

import com.scode.constant.ProductType;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;


public record LoanRequest(@NotNull(message = "ProductType can't be Empty") ProductType productType,
                          @NotNull(message = "DownPayment can't be NULL") BigDecimal downPayment,
                          @NotNull(message = "LoanAmount can't be NULL") BigDecimal loanAmount,
                          @NotNull(message = "InterestRate can't be NULL") BigDecimal interestRate) {

}
