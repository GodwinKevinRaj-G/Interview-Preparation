package com.interviewpreparation.interviewpreparation.exception.handler;

import com.interviewpreparation.interviewpreparation.exception.customexception.PaymentException;
import com.interviewpreparation.interviewpreparation.exception.dto.ErrorResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(PaymentException.class)
    public ResponseEntity<ErrorResponseDto> handlePaymentErrors(PaymentException exception, WebRequest request) {
        ErrorResponseDto errorResponse = new ErrorResponseDto(exception.getMessage(), request.getDescription(false), LocalDateTime.now());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponseDto> handleGlobalException(Exception ex, WebRequest request) {
        ErrorResponseDto error = new ErrorResponseDto(ex.getMessage(), request.getDescription(false), LocalDateTime.now());
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
