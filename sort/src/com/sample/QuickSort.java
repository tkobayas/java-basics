package com.sample;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        
        int[] array = new int[] { 5, 4, 6, 7, 1, 9, 8, 2, 3 };
        
        // O(n log n)
        sort(array, 0, array.length - 1);
        
        System.out.println(Arrays.toString(array));
    }

    private static void sort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        
        int pivotData = array[(left + right) / 2];
        int leftPointer = left;
        int rightPointer = right;
        
        while (leftPointer < rightPointer) {
            while (array[leftPointer] < pivotData) {
                leftPointer++;
            }
            while (array[rightPointer] > pivotData) {
                rightPointer--;
            }
            if (leftPointer <=rightPointer) {
                int tmp = array[leftPointer];
                array[leftPointer] = array[rightPointer];
                array[rightPointer] = tmp;
                leftPointer++;
                rightPointer--;
            }
        }
        sort(array, left, rightPointer);
        sort(array, leftPointer, right);
    }
}
