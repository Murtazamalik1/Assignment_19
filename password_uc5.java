package com.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class password_uc5 {

    public static void main(String[] args) {
        String password = "malikabc";
        Pattern pattern = Pattern.compile("^[a-z0-9]{8}$");
        Matcher matcher = pattern.matcher(password);
        System.out.print(matcher.find());

    }
}
