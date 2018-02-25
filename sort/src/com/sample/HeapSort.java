package com.sample;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {

        int[] array = new int[]{5, 4, 6, 7, 1, 9, 8, 2, 3};

        // O(n log n)

        // Create heap
        for (int i = 1; i < array.length; i++) {
            upheap(array, i);
        }

        // heap to array
        for (int i = array.length - 1; i > 0; i--) {
            swap(array, 0, i); // move max value to the end
            downheap(array, i - 1); // re-heapify the rest
        }

        System.out.println(Arrays.toString(array));
    }

    private static void upheap(int[] array, int n) {
        while (n > 0) {
            int parent = ((n) + 1) / 2 - 1;
            if (array[parent] < array[n]) {
                swap(array, parent, n);
            } else {
                break;
            }
            n = parent;
        }
    }

    private static void downheap(int[] array, int end) {
        int currentRoot = 0;
        while (true) {
            int leftChild = ((currentRoot) + 1) * 2 - 1;
            int rightChild = ((currentRoot) + 1) * 2;
            if (leftChild > end) {
                break;
            }
            
            int tmp = currentRoot;
            if (array[leftChild] > array[currentRoot]) {
                tmp = leftChild;
            }
            if ((rightChild <= end) && (array[rightChild] > array[tmp])) {
                tmp = rightChild;
            }
            if (tmp == currentRoot) {
                break;
            }
            swap(array, tmp, currentRoot);
            
            currentRoot = tmp;
        }
    }

    public static void swap(int[] array, int idx1, int idx2) {
        int tmp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = tmp;
    }
}
