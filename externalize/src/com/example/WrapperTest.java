package com.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class WrapperTest {

    public static void main(String[] args) throws Exception {

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("key1", new PersonWrapper(new Person("Paul", 40)));
        map.put("key2", "XYZ");

        FileOutputStream fileOut = new FileOutputStream("map2.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(map);
        out.close();
        fileOut.close();
        
        System.out.println("-- write done");
        
        FileInputStream fileIn = new FileInputStream("map2.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        Object object = in.readObject();
        
        System.out.println(object);
        
        in.close();
        fileIn.close();
    }
}
