package com.scode.service;

import com.scode.controller.validation.ValidateLoanRequest;
import com.scode.model.LoanRequest;
import com.scode.model.LoanResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {

    private List<LoanResponse> loanRequests = new ArrayList<>();

    public List<LoanResponse> all() {
        return loanRequests;
    }

    @ValidateLoanRequest
    public LoanResponse add(LoanRequest request) {
        var response = new LoanResponse(loanRequests.size(), request);
        loanRequests.add(response);
        return response;
    }

}
