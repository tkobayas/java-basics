package com.sample;

public class Ex04String {

    public static void main(String[] args) {

        String sentence = "This       is a pen.";
        
        System.out.println(sentence.matches("Th.* is a .*\\."));
        
        String[] words = sentence.split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }
        
        System.out.println(sentence.replaceAll("\\s+", ":"));
    }
}
