package com.scode.controller.validation;

import com.scode.model.LoanRequest;

@FunctionalInterface
public interface LoanValidator {
    Boolean isValid(LoanRequest person);
}
