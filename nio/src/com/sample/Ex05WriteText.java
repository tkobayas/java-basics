package com.sample;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Ex05WriteText {

    public static void main(String[] args) {
        
        Path path = Paths.get("./work/sample.txt");
        
        try (BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.APPEND)) {
            
            bw.append("test");
            bw.newLine();
            bw.append("test2");
            bw.newLine();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
