package com.sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Ex07FileCopy {

    public static void main(String[] args) {

        Path fromPath = Paths.get("./work/sample.dat");
        Path toPath = Paths.get("./work/copy.dat");

        try {
            Files.copy(fromPath, toPath, StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
