package com.scode.controller;

import com.scode.model.LoanRequest;
import com.scode.model.LoanResponse;
import com.scode.service.LoanService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.jmx.access.InvalidInvocationException;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/loan")
public record LoanController (LoanService loanService) {

    @GetMapping("/all")
    public List<LoanResponse> getAll() {
        return loanService.all();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public LoanResponse add(@RequestBody @Valid LoanRequest request) {
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Unable to process!!");
//        return loanService.add(request);
    }
}
