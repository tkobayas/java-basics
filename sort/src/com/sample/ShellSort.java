package com.sample;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {

        int[] array = new int[]{5, 4, 6, 7, 1, 9, 8, 2, 3};

        // O(n^1.25)
        for (int range = array.length / 2; range > 0; range = range / 2) {
            for (int h = 0; h < range; h++) {
                for (int i = h + range; i < array.length; i += range) {
                    int insertionData = array[i];
                    int j = i;
                    for (; j >= range && array[j - range] > insertionData; j -= range) {
                        array[j] = array[j - range];
                    }
                    array[j] = insertionData;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
