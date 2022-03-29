package com.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {


    public static boolean firstName(String name) {
        boolean check = Pattern.matches("([A-Z][a-z]{3,})", name);
        return check;
    }
    public static boolean lastName(String name) {
        boolean check = Pattern.matches("([A-Z][a-z]{3,})", name);
        return check;
    }
    public static boolean emailId(String email) {
        boolean check = Pattern.matches("^(.+)@(.+)$", email);
        return check;
    }




}
