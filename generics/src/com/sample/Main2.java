package com.sample;

import java.util.ArrayList;

import com.sample.generics.GenericStack;
import com.sample.generics.GenericStackUtil;

public class Main2 {

    public static void main(String[] args) {
        
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("ASD");
        stringList.add("ZXC");
        
        GenericStack<String> stack = GenericStackUtil.as(stringList);
        
        System.out.println(stack.pop());

    }
}
