package com.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ex01Error {

    public static void main(String[] args) {


        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ken", 100));
        studentList.add(new Student("Shin", 60));
        studentList.add(new Student("Takuya", 80));
        

        Stream<Student> stream = studentList.stream();
        stream.filter(s -> s.getScore() >= 70)
            .forEach(s -> System.out.println(s.getName()));
        
        stream.filter(s -> s.getScore() >= 70)
        .forEach(s -> System.out.println(s.getName()));
    }
}
