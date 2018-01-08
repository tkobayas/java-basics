package com.sample;

import com.sample.generics.NumberStack;

public class Main3 {

    public static void main(String[] args) {
        
        NumberStack<Integer> numStack = new NumberStack<>();
        
        numStack.push(100);
        numStack.push(200);
        numStack.push(300);
        
        Integer numElement = numStack.pop();
        
        System.out.println(numElement);
        

    }
}
