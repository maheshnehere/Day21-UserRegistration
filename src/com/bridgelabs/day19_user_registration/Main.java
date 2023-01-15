package com.bridgelabs.day19_user_registration;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Welcome to day 19 user registration program");
        UserRegistration user = new UserRegistration();
        Scanner scanner = new Scanner(System.in);
        //first name
        System.out.println("Enter the first name to validate");
        String firstName = scanner.next();
        if (user.name.validate(firstName))
            System.out.println("Valid input first name");
        else
            System.out.println("Invalid input first name");
        //last name
        System.out.println("Enter the last name to validate");
        String lastName = scanner.next();
        if (user.name.validate(firstName))
            System.out.println("Valid input last name");
        else
            System.out.println("Invalid input last name");
        //email
        System.out.println("Enter the email id");
        String email = scanner.next();
        if (user.email.validate(email))
            System.out.println("Valid input email");
        else
            System.out.println("Invalid input email");
        //mobile
        System.out.println("Enter the mobile number");
        String mobile = scanner.next();
        if (user.mobile.validate(mobile))
            System.out.println("Valid input mobile number");
        else
            System.out.println("Invalid input mobbile number");
        //password
        System.out.println("Enter the password");
        String password = scanner.next();
        if (user.password.validate(password))
            System.out.println("Valid input password");
        else
            System.out.println("Invalid input password");
        //sample email check
        SampleEmailCheck sampleEmailCheck = new SampleEmailCheck();
        sampleEmailCheck.validEmailcheck();
        sampleEmailCheck.invalidEmailcheck();
    }
}
