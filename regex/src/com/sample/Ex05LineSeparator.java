package com.sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex05LineSeparator {

    public static void main(String[] args) {
        
        Pattern pattern = Pattern.compile("aaa.*bbb");
        
//        String sentence = "aaa is a bbb";
        String sentence = "aaa is \na bbb";
        
        Matcher matcher = pattern.matcher(sentence);
        
        if (matcher.matches()) {
            System.out.println("match");
        } else {
            System.out.println("no match");
        }
    }
}
