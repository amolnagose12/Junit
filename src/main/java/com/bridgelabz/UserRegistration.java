package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean firstName(String firstName) {
        String pattern = "^[A-Z][a-z]{3,}";
        Pattern firstN= Pattern.compile(pattern);
        Matcher match = firstN.matcher(firstName);
        if (match.matches()) {
            return true;
        }
            return false;
    }

    public static void main(String[] args) {
        System.out.println(firstName("Amol"));
    }
}
