package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validemail_uc3 {
    public static void main(String[] args) {

        String email = "abc.XYZ@bl.co.in";


        Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Matcher matcher = pattern.matcher(email);
        System.out.println(matcher.find());
    }
}
