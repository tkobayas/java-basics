package com.sample;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex12RangeList {

    public static void main(String[] args) {

        List<Integer> rangeList = IntStream.range(1, 100).boxed().collect(Collectors.toList());
        
        System.out.println(rangeList);
    }
}
