package com.sample;

import java.util.stream.Stream;

public class Ex05StreamOf {

    public static void main(String[] args) {

        Stream<Student> stream = Stream.of(new Student("Ken", 100), new Student("Shin", 60), new Student("Takuya", 80));

        stream
            .filter(s -> s.getScore() >= 70)
            .forEach(s -> System.out.println(s.getName()));
    }
}
