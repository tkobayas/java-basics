package com.sample;

import java.util.Arrays;

public class Ex03Array {

    public static void main(String[] args) {

        Student[] students = {new Student("Ken", 100), new Student("Shin", 60), new Student("Takuya", 80)
        };

        Arrays.sort(students, (s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()));
        
        Arrays.stream(students).forEach(s -> System.out.println(s.getName() + " : " + s.getScore()));
        
    }
}
