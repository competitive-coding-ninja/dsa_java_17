package com.quantum_adrenaline_1.dsa_java_17.algorithm.array.sort.bubble_sort;

import java.util.Arrays;

enum SortingScheme {
    ASCENDING,
    DESCENDING
}

public final class BubbleSort {
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

    public static void main(String[] args) {
        final int[] userArray = {5, 8, 6, 3, 2, 9, 1};

        bubbleSort(userArray, SortingScheme.ASCENDING);

        System.out.println(Arrays.toString(userArray));

        bubbleSort(userArray, SortingScheme.DESCENDING);

        System.out.println(Arrays.toString(userArray));
    }
}
