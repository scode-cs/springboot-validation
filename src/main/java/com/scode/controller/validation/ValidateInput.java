package com.scode.controller.validation;

import com.scode.model.LoanRequest;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class ValidateInput {

    public static void validateRequest(LoanRequest loanRequest){

//        if( Objects.isNull(customer.getName()) || customer.getName().isEmpty()){
//            throw new InvalidInputException("Invalid input - name cannot be null");
//        }
//        if( Objects.isNull(customer.getAddresses())
//                || (Objects.nonNull(customer.getAddresses()) && customer.getAddresses().isEmpty())){
//            throw new InvalidInputException("Invalid input - address cannot be null");
//        }
    }
}
