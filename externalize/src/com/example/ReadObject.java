package com.example;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {

    public static void main(String[] args) throws Exception {

        FileInputStream fileIn = new FileInputStream("map.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        Object object = in.readObject();
        
        System.out.println(object);
        
        in.close();
        fileIn.close();
    }
}
