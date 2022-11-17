package com.regex;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

public class Pre_define_mobile_format_uc
{
    @Test
    public static void main(String[] args) {
        String mobile = "916005626571";

        Pattern pattern = Pattern.compile("^[0-9]{12}");
        Matcher matcher = pattern.matcher(mobile);
        System.out.println(matcher.find());
        System.out.print(mobile);

    }
}
