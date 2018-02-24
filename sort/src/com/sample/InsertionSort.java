package com.sample;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        
        int[] array = new int[] { 5, 4, 6, 7, 1, 9, 8, 2, 3 };
        
        // O(n^2)
        for (int i = 1; i < array.length; i++) {
            int insertionData = array[i];
            int j = i;
            for (; j >= 1 && array[j - 1] > insertionData; j--) {
                array[j] = array[j - 1];
            }
            array[j] = insertionData;
        }
        
        System.out.println(Arrays.toString(array));
    }
}
