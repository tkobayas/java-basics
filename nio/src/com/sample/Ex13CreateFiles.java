package com.sample;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex13CreateFiles {

    public static void main(String[] args) {

        Path path = Paths.get("./work/new.dat");

        try {
            
            Files.createFile(path);

        } catch (FileAlreadyExistsException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
