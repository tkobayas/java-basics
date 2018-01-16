package com.sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex03ReplaceAll {

    public static void main(String[] args) {
        
        Pattern pattern = Pattern.compile("\\s+");
        
        String sentence = "This       is a pen.";
        
        Matcher matcher = pattern.matcher(sentence);
        
        String result = matcher.replaceAll("/");
        
        System.out.println(result);
    }
}
