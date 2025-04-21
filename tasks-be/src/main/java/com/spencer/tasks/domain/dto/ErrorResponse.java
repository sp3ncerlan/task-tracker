package com.spencer.tasks.domain.dto;

public record ErrorResponse(int status, String message, String details) {

}
