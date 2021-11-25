package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean email(String email) {
        String pattern = "([a-z]{3,})(.)([a-z]*)[@][a-z]{2}(.)([a-z]{2})(.)([in]*)";
        Pattern emailVal= Pattern.compile(pattern);
        Matcher match = emailVal.matcher(email);
        if (match.matches()) {
            return true;
        }
            return false;
    }

    public static void main(String[] args) {
        System.out.println(email("amolnagose12@gmail.com"));
    }
}
