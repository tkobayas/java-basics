package com.sample;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        
        int[] array = new int[] { 5, 4, 6, 7, 1, 9, 8, 2, 3 };
        
        // O(n^2)
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }
        
        System.out.println(Arrays.toString(array));
    }
}
