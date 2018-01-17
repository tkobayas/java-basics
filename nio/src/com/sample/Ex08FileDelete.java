package com.sample;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex08FileDelete {

    public static void main(String[] args) {

        Path path = Paths.get("./work/copy.dat");

        try {
            
            Files.delete(path);

        } catch (NoSuchFileException e) {
            e.printStackTrace();
        } catch (DirectoryNotEmptyException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
