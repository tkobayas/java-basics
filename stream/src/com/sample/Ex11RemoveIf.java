package com.sample;

import java.util.ArrayList;
import java.util.List;

public class Ex11RemoveIf {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ken", 100));
        studentList.add(new Student("Shin", 60));
        studentList.add(new Student("Takuya", 80));
        studentList.add(new Student("Sakamoto", 100));

        studentList.removeIf(s -> s.getScore() < 70);
        
        System.out.println(studentList);
    }
}
