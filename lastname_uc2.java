package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lastname_uc2 {
    public static void main(String[] args) {
        String value = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name ");
        value = sc.next();
        Pattern pattern = Pattern.compile("[a-z][A-Z]{3}$");
        Matcher matcher = pattern.matcher(value);
        System.out.println(matcher.find());
    }
}
