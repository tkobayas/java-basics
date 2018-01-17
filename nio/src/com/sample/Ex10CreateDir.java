package com.sample;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex10CreateDir {

    public static void main(String[] args) {

        Path path = Paths.get("./work/newDir");

        try {
            
            Files.createDirectory(path);

        } catch (FileAlreadyExistsException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
