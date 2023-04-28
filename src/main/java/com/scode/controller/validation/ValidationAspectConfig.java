package com.scode.controller.validation;

import com.scode.model.LoanRequest;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Slf4j
@Aspect
@Component
public class ValidationAspectConfig {

    @Around("@annotation(ValidateLoanRequest)")
    public Object validateInput(ProceedingJoinPoint pjp) throws Throwable {

        log.info("AOP intercept for method - "+pjp.getSignature());

        Object[] requestObject = pjp.getArgs();
        if ( requestObject.length >0  && requestObject[0] instanceof LoanRequest request ){

            // first object in the arguments
            if (Objects.isNull(request)){
//                throw new InvalidInputException("Input invalid - Cannot be null");
            }

            //Performing validation for the input request intercepted and received
            ValidateInput.validateRequest(request);

        }else{
            log.info("input object is not of customer instance");
        }

        //just obtain the obj from the ProceedingJoinPoint
        Object obj = pjp.proceed();

        log.info("Completed executing the AOP intercept");
        return obj;
    }
}
