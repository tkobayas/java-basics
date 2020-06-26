package com.example;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class WriteObject {

    public static void main(String[] args) throws Exception {

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("key1", new Person("John", 37));
        map.put("key2", "ABC");

        FileOutputStream fileOut = new FileOutputStream("map.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(map);
        out.close();
        fileOut.close();
        
        System.out.println("-- done");
    }
}
