package com.alexandrl.blogdriver.service.exceptions;

public class ValidateUserException extends RuntimeException {

    private String message;

    public ValidateUserException(String message) {
    }

    public String getMessage() {
        return message;
    }

}
