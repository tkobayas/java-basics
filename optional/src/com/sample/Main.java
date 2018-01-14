package com.sample;

import java.util.Optional;

import com.sample.generics.OptionalStack;

public class Main {

    public static void main(String[] args) {
        
        OptionalStack<String> optStack = new OptionalStack<>();
        
        Optional<String> optional = optStack.pop();
        
//        String value1 = optional.get();
//        System.out.println(value1);
        
        
        String value2 = optional.orElse("empty");
        System.out.println(value2);
        
        optStack.push("ABC");
        optStack.push("XYZ");
        optStack.push("QWE");
        
        optional = optStack.pop();
        
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }
        
        optional = optStack.pop();

        optional.ifPresent(System.out::println);
    }
}
