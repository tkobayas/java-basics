package com.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex02Sort {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ken", 100));
        studentList.add(new Student("Shin", 60));
        studentList.add(new Student("Takuya", 80));

        System.out.println(studentList);
        
        System.out.println("--------------------");
        
        Collections.sort(studentList, (s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()));
        
        System.out.println(studentList);
        
    }
}
