package com.sample;

import java.util.ArrayList;
import java.util.List;

public class Ex08Sorted {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ken", 100));
        studentList.add(new Student("Shin", 60));
        studentList.add(new Student("Takuya", 80));

        studentList.stream()
                .sorted((s1, s2) -> s2.getScore() - s1.getScore())
                .forEach(System.out::println);
    }
}
