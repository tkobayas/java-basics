package com.sample;

import java.util.ArrayList;
import java.util.List;

public class Ex13FlatMap {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ken", 100));
        studentList.add(new Student("Shin", 60));
        studentList.add(new Student("Takuya", 80));
        
        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(new Student("Ken2", 100));
        studentList2.add(new Student("Shin2", 60));
        studentList2.add(new Student("Takuya2", 80));
        
        List<List<Student>> wrapper = new ArrayList<>();
        wrapper.add(studentList);
        wrapper.add(studentList2);


        wrapper.stream()
                .flatMap(l -> l.subList(0, 2).stream())
                .forEach(System.out::println);
    }
}
