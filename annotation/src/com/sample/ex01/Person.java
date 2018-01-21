package com.sample.ex01;

@MyAnnotation
public class Person {

    @MyAnnotation(value = "hello field")
    private String name;

    
    @MyAnnotation("goodbye method")
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }
    
    
}
