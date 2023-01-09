package com.bridgelabs.day19_user_registration;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to day 19 user registration program");
        UserRegistration user = new UserRegistration();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name to validate");
        String firstName = scanner.next();
        if (user.Validation(firstName) == true)
            System.out.println("Valid input first name");
        else
            System.out.println("Invalid input first name");
        System.out.println("Enter the first name to validate");
        String lastName = scanner.next();
        if (user.Validation(lastName) == true)
            System.out.println("Valid input last name");
        else
            System.out.println("Invalid input last name");
    }
}
