package com.sample;

import com.sample.generics.GenericStack;

public class Main {

    public static void main(String[] args) {
        
        GenericStack<String> genStack = new GenericStack<>();
        
        genStack.push("ABC");
        genStack.push("XYZ");
        genStack.push("QWE");
        
        String genElement = genStack.pop();
        
        System.out.println(genElement);
        
        GenericStack<Integer> genStack2 = new GenericStack<>();
        
        genStack2.push(100);
        genStack2.push(200);
        
        Integer genElement2 = genStack2.pop();
        
        System.out.println(genElement2);

    }
}
