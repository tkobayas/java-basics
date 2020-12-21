package com.sample;


public class SubClass extends SuperClass{

    public SubClass() {
        System.out.println("SubClass <init>");
    }
    
    public SubClass(String str) {
        super(str);
        System.out.println("SubClass <init> str = " + str);
    }
}
