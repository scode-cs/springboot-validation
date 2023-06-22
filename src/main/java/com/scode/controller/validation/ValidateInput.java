package com.scode.controller.validation;

import com.scode.model.LoanRequest;
import lombok.experimental.UtilityClass;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;

@UtilityClass
public class ValidateInput {

    public static void validateRequest(LoanRequest request) {
        if (request.interestRate().compareTo(BigDecimal.ZERO) < 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Input request can't be blank!!");
        }

        if (request.loanAmount().compareTo(request.downPayment()) < 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Downpayment can't be greater than the loan amount!!");
        }

    }
}
