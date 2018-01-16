package com.sample;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex01ReadBinary {

    public static void main(String[] args) {
        
        Path path = Paths.get("./work/sample.dat");
        
        try (InputStream is = Files.newInputStream(path)) {
            for (int ch; (ch = is.read()) != -1; ) {
                System.out.println(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
