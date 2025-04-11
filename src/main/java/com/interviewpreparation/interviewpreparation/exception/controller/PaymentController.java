package com.interviewpreparation.interviewpreparation.exception.controller;

import com.interviewpreparation.interviewpreparation.exception.customexception.PaymentException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PaymentController {

    @GetMapping("/test")
    public String testData(@RequestParam(required = false) String id) throws PaymentException {
        if (id == null) {
            throw new PaymentException("Id is missing");
        }
        return "ID is " + id;
    }
}
