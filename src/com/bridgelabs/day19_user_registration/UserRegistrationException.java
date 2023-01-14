package com.bridgelabs.day19_user_registration;

public class UserRegistrationException extends Exception {
    public enum ExceptionType {
        InValidName, InValidEmail, InValidMobile, InValidPassword;
    }
    final ExceptionType type;
    public UserRegistrationException(ExceptionType type, String message)
    {
        super(message);
        this.type = type;
    }
}
