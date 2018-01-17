package com.sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex12CreateTmpFile {

    public static void main(String[] args) {

        Path path = Paths.get("./work/newDir");

        try {
            Path tempPath = Files.createTempFile(path, "pre", ".tmp");
            System.out.println(tempPath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
