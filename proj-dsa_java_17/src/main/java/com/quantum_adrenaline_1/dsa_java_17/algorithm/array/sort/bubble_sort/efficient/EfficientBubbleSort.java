package com.quantum_adrenaline_1.dsa_java_17.algorithm.array.sort.bubble_sort.efficient;

import java.util.Arrays;

enum SortingScheme {
    ASCENDING,
    DESCENDING
}

/**
 * @implNote : optimizing Bubble Sort to skip the redundant iteration and conclude the sort once the array is sorted instead of letting the algorithm perform all the iterations
 * @author : quantum-adrenaline-1
 */
public final class EfficientBubbleSort {
    /**
     * @implNote : optimized Bubble Sort executing the algorithm only until the array is sorted
     * @param array : 'int' array to be sorted
     * @author : quantum-adrenaline-1
     */
    private static void optimizedBubbleSort(int[] array) {
        boolean noSortOps = true;
        for (int outerIndex = array.length - 1; outerIndex > 0; outerIndex--) {
            for (int innerIndex = 0; innerIndex < outerIndex; innerIndex++) {
                if (array[innerIndex] > array[innerIndex + 1]) {
                    int swapOperation = array[innerIndex];
                    array[innerIndex] = array[innerIndex + 1];
                    array[innerIndex + 1] = swapOperation;
                    noSortOps = false;
                }
            }
            if (noSortOps) break;
            noSortOps = true;
        }
    }

    /**
     * @implNote : 'main' method for implementing execution for 'Optimized Bubble Sort' implementation in this class
     * @param args : 'runtime' string array arguments for main method
     * @author : quantum-adrenaline-1
     */
    public static void main(String[] args) {
        final int[] userArray = {3, 1, 4, 2, 9, 7, 6};

        optimizedBubbleSort(userArray);

        System.out.println(Arrays.toString(userArray));
    }
}
