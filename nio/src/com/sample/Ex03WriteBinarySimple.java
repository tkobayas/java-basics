package com.sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Ex03WriteBinarySimple {

    public static void main(String[] args) {

        Path path = Paths.get("./work/sample.dat");

        byte[] data = new byte[]{0x41, 0x42, 0x43};

        try {
            Files.write(path, data, StandardOpenOption.APPEND, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
