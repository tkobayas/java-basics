package com.sample;

import java.util.Optional;

public class Ez02 {

    
    public static void main(String[] args) {
        // Optional<String> opt = Optional.of("XXX");
        Optional<String> opt = Optional.empty();


        opt.ifPresent(System.out::println);
    }
}
