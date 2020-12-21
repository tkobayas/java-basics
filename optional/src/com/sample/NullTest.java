package com.sample;

import java.util.Optional;

public class NullTest {

    public static void main(String[] args) {
        
        Optional<String> test1 = Optional.ofNullable(null);
        
        System.out.println("test1 = " + test1);
        
        System.out.println("test1.isPresent() = " + test1.isPresent());
        
        System.out.println("test1.get()= " + test1.get());
    }
}
