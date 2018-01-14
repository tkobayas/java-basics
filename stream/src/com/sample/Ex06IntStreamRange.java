package com.sample;

import java.util.stream.IntStream;

public class Ex06IntStreamRange {

    public static void main(String[] args) {

        IntStream rangeClosed = IntStream.rangeClosed(1, 5);
        rangeClosed.forEach(System.out::println);
    }
}
