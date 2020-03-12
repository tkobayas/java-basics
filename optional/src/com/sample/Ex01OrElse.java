package com.sample;

import java.util.Optional;

public class Ex01OrElse {

    public static void main(String[] args) {
        
        Optional<String> opt1 = Optional.of("Hello");
        
        String str1 = opt1.orElse(null);
        
        System.out.println(str1);
        
        Optional<String> opt2 = Optional.ofNullable(null);
        
        String str2 = opt2.orElse(null);
        
        System.out.println(str2);
    }
    
}
