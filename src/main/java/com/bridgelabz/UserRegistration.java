package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean passwordValidation(String password) {
        String pattern ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        Pattern pass= Pattern.compile(pattern);
        Matcher match = pass.matcher(password);
        if (match.matches()) {
            return true;
        }
            return false;
    }

    public static void main(String[] args) {
        System.out.println(passwordValidation("aaZZa44@"));
    }
}
