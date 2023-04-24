package com.bridgelabs.day19_user_registration;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SampleEmailCheck {
    ArrayList<String> validEmails = new ArrayList<>();
    ArrayList<String> inValidEmails = new ArrayList<>();
    public void sampleEmailCheck() throws FileNotFoundException {
        File file1 = new File("C:\\Users\\Sourav Prasanna\\IdeaProjects\\Day19-RegexUserRegistration\\src\\com\\bridgelabs\\day19_user_registration\\ValidEmails.txt");
        File file2 = new File("C:\\Users\\Sourav Prasanna\\IdeaProjects\\Day19-RegexUserRegistration\\src\\com\\bridgelabs\\day19_user_registration\\InvalidEmails.txt");
        Scanner sc1 = new Scanner(file1); //this scanner will only take the input from this file path
        Scanner sc2 = new Scanner(file2);
        while(sc1.hasNextLine()) {
            validEmails.add(sc1.nextLine()); //this loop will continue unless there is no next line and add each line as a arraylist
        }
        while(sc2.hasNextLine()) {
            inValidEmails.add(sc2.nextLine());
        }
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([-+.][a-zA-Z0-9]+)*[@][a-zA-Z0-9]{1,}[.][a-zA-Z]{2,3}([.][a-zA-Z]{2,3})?$");
        System.out.println("\nList of valid email samples\n");
        for (String valid : validEmails) {
            boolean matches = pattern.matcher(valid).matches();
            if(matches)
                System.out.println(valid+" valid email");
            else
                System.out.println(valid+" Invalid email");
        }
        System.out.println("\nList of InValid email samples\n");
        for (String inValid : inValidEmails) {
            boolean matches = pattern.matcher(inValid).matches();
            if(matches)
                System.out.println(inValid+" valid email");
            else
                System.out.println(inValid+" Invalid email");
        }
    }
}

