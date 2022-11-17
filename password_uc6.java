package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class password_uc6 {

    public static void main(String[] args) {
        String password = "Murtazaa";
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]{8}$");
        Matcher matcher = pattern.matcher(password);
        System.out.print(matcher.find());

    }
}
