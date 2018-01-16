package com.sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex01Matches {

    public static void main(String[] args) {
        
        Pattern pattern = Pattern.compile("This is a .*\\.");
        
        String sentence = "This is a pen.";
        
        Matcher matcher = pattern.matcher(sentence);
        
        if (matcher.matches()) {
            System.out.println("match");
        } else {
            System.out.println("no match");
        }
    }
}
