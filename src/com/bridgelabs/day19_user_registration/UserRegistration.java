package com.bridgelabs.day19_user_registration;

import java.util.regex.Pattern;

public class UserRegistration {
    boolean matches;

    public IValidator name = (name) -> {
        try {
            Pattern pattern=Pattern.compile("^[A-Z][a-zA-Z]{2,}");
            matches = pattern.matcher(name).matches();
            if(matches) {
                return matches;
            }
            else {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.InValidName, "Invalid Name, please check the entered name");
            }
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
        return matches;
    };
    public IValidator email = (email) -> {
        try {
            Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([._-[+]][a-zA-Z0-9]+)*@([a-z1-9]+)([.][a-z]*)?(\\.[a-z]{2,})$");
            matches = pattern.matcher(email).matches();
            if(matches) {
                return matches;
            }
            else {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.InValidEmail, "Invalid Email, please check the entered email");
            }
        }
        catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
        return matches;
    };
    public IValidator mobile = (mobile) -> {
        try {
            Pattern pattern = Pattern.compile("^(91[ ])?[6-9]{1}[0-9]{9}$");
            boolean matches = pattern.matcher(mobile).matches();
            if(matches) {
                return matches;
            }
            else {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.InValidMobile, "Invalid Mobile number, please check the entered number");
            }
        }
        catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
        return matches;
    };
    public IValidator password = (password) -> {
        try {
            Pattern pattern = Pattern.compile("(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8}");
            boolean matches = pattern.matcher(password).matches();
            if(matches) {
                return matches;
            }
            else {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.InValidPassword, "Invalid password, please check the entered password");
            }
        }
        catch(UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
        return matches;
    };
}
