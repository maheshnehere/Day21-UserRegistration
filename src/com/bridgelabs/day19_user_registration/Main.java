package com.bridgelabs.day19_user_registration;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Welcome to day 19 user registration program");
        UserRegistration user = new UserRegistration();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name to validate");
        String firstName = scanner.next();
        if (user.validateName(firstName) == true)
            System.out.println("Valid input first name");
        else
            System.out.println("Invalid input first name");
        System.out.println("Enter the last name to validate");
        String lastName = scanner.next();
        if (user.validateName(lastName) == true)
            System.out.println("Valid input last name");
        else
            System.out.println("Invalid input last name");
        System.out.println("Enter the email id");
        String email = scanner.next();
        if (user.validateEmail(email) == true)
            System.out.println("Valid input email");
        else
            System.out.println("Invalid input email");
        System.out.println("Enter the mobile number");
        String mobile = scanner.next();
        if (user.validateMobile(mobile) == true)
            System.out.println("Valid input mobile number");
        else
            System.out.println("Invalid input mobbile number");
        System.out.println("Enter the password");
        String password = scanner.next();
        if (user.validatePassword(password) == true)
            System.out.println("Valid input password");
        else
            System.out.println("Invalid input password");
        SampleEmailCheck sampleEmailCheck = new SampleEmailCheck();
        sampleEmailCheck.validEmailcheck();
        sampleEmailCheck.invalidEmailcheck();
    }
}
