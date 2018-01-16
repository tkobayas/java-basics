package com.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex06ReadStream {

    public static void main(String[] args) {
        
        Path path = Paths.get("./work/userlist.txt");
        
        try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            br.lines()
                .map(s -> s.split(" ")[0])
                .distinct()
                .forEach(System.out::println);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
