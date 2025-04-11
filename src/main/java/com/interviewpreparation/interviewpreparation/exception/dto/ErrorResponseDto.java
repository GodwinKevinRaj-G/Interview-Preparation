package com.interviewpreparation.interviewpreparation.exception.dto;

import java.time.LocalDateTime;

public class ErrorResponseDto {
    String message;
    String details;
    LocalDateTime localDateTime;

    public ErrorResponseDto(String message, String request, LocalDateTime localDateTime) {
        this.message = message;
        this.details = request;
        this.localDateTime = localDateTime;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}
