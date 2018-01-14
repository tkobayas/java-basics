package com.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex09ToList {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ken", 100));
        studentList.add(new Student("Shin", 60));
        studentList.add(new Student("Takuya", 80));

        List<Student> newList = studentList.stream()
                .sorted((s1, s2) -> s2.getScore() - s1.getScore())
                .collect(Collectors.toList());
        
        System.out.println(newList);
    }
}
