package com.example.inmap;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.TreeMap;

import com.example.Person;

public class WrapperTest {

    public static void main(String[] args) throws Exception {

        TreeMap<String, Object> map = new TreeMap<String, Object>();
        map.put("key1", new Person("Paul", 45));
        map.put("key2", "XYZ!");

        FileOutputStream fileOut = new FileOutputStream("map3.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(map);
        out.close();
        fileOut.close();
        
        System.out.println("-- write done");
        
        FileInputStream fileIn = new FileInputStream("map3.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        Object object = in.readObject();
        
        System.out.println(object);
        
        in.close();
        fileIn.close();
    }
}
