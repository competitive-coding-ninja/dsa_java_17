package com.quantum_adrenaline_1.dsa_java_17.algorithm.array.sort.bubble_sort;

import java.util.Arrays;

/**
 * @implNote : sorting scheme to mention the sorting order preference in sorting
 * @author : quantum-adrenaline-1
 */
enum SortingScheme {
    ASCENDING,
    DESCENDING
}

/**
 * @implNote : conventional Bubble Sort implementation for both ascending and descending sorting preference
 * @author : quantum-adrenaline-1
 */
public final class BubbleSort {
    /**
     * @implNote : conventional Bubble Sort implementation for both ascending and descending sorting preference
     * @param userArray : the array to be sorted
     * @param sortingScheme : the sorting scheme (sorting order) for Bubble Sort algorithm
     * @author : quantum-adrenaline-1
     */
    private static void bubbleSort(int[] userArray, SortingScheme sortingScheme) {
        if (sortingScheme == SortingScheme.ASCENDING) {
            for (int outerIndex = userArray.length - 1; outerIndex > 0; outerIndex--) {
                for (int innerIndex = 0; innerIndex < outerIndex; innerIndex++) {
                    if (userArray[innerIndex] > userArray[innerIndex + 1]) {
                        int swapAccumulator = userArray[innerIndex];
                        userArray[innerIndex] = userArray[innerIndex + 1];
                        userArray[innerIndex + 1] = swapAccumulator;
                    }
                }
            }
        } else if (sortingScheme == SortingScheme.DESCENDING) {
            for (int outerIndex = 0; outerIndex < userArray.length - 1; outerIndex++) {
                for (int innerIndex = userArray.length - 1; innerIndex > outerIndex; innerIndex--) {
                    if (userArray[innerIndex] > userArray[innerIndex - 1]) {
                        int swapAccumulator = userArray[innerIndex];
                        userArray[innerIndex] = userArray[innerIndex - 1];
                        userArray[innerIndex - 1] = swapAccumulator;
                    }
                }
            }
        }
    }

    /**
     * @implNote : 'main' method for implementing execution for 'Bubble Sort' implementation in this class
     * @param args : 'runtime' string array arguments for main method
     * @author : quantum-adrenaline-1
     */
    public static void main(String[] args) {
        final int[] userArray = {5, 8, 6, 3, 2, 9, 1};

        bubbleSort(userArray, SortingScheme.ASCENDING);

        System.out.println(Arrays.toString(userArray));

        bubbleSort(userArray, SortingScheme.DESCENDING);

        System.out.println(Arrays.toString(userArray));
    }
}
