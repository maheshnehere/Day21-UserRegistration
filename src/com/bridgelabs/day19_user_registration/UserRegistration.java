package com.bridgelabs.day19_user_registration;

import java.util.regex.Pattern;

public class UserRegistration { 
        public boolean validateName(String name)
        {
            Pattern pattern=Pattern.compile("^[A-Z][a-zA-Z]{2,}");
            boolean matches = pattern.matcher(name).matches();
            return matches;
        }
    public boolean validateEmail(String email) {
/*        E.g. abc.xyz@bl.co.in
        Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in)
        with precise @ and . positions
 */
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([._-[+]][a-zA-Z0-9]+)*@([a-z1-9]+)([.][a-z]*)?(\\.[a-z]{2,})$");
        boolean matches = pattern.matcher(email).matches();
        return matches;
    }
    public boolean validateMobile(String mobile) {
        Pattern pattern = Pattern.compile("^(91[ ])?[6-9]{1}[0-9]{9}$");
        boolean matches = pattern.matcher(mobile).matches();
        return matches;
    }
    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile("(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8}");
        boolean matches = pattern.matcher(password).matches();
        return matches;
    }
}
