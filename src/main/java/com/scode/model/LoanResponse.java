package com.scode.model;

import com.scode.constant.ProductType;

import java.math.BigDecimal;
import java.math.BigInteger;

public record LoanResponse(Integer id, ProductType productType, BigDecimal downPayment,
                           BigDecimal loanAmount, BigDecimal interestRate) {

    public LoanResponse(Integer id, LoanRequest request) {
        this(id+1, request.productType(), request.downPayment(), request.loanAmount(), request.interestRate());
    }

}

