package com.bridgelabs.day19_user_registration;

import java.util.regex.Pattern;
public class UserRegistration {
        public boolean Validation(String name)
        {
            Pattern pattern=Pattern.compile("^[A-Z][a-zA-Z]{2,}");
            boolean matches = pattern.matcher(name).matches();
            return matches;
        }
}
