package com.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex10GroupingBy {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ken", 100));
        studentList.add(new Student("Shin", 60));
        studentList.add(new Student("Takuya", 80));
        studentList.add(new Student("Sakamoto", 100));


        Map<Integer, List<Student>> groupedMap = studentList.stream()
                .collect(Collectors.groupingBy(Student::getScore));
        
        System.out.println(groupedMap.get(100));
    }
}
