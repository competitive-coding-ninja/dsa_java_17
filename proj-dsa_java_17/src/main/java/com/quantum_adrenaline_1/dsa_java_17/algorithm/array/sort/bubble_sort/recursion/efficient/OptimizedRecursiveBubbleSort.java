package com.quantum_adrenaline_1.dsa_java_17.algorithm.array.sort.bubble_sort.recursion.efficient;

import java.util.Arrays;

/**
 * @implNote : optimized implementation of Bubble Sort (sort iteration count optimization) with recursion
 * @author : quantum-adrenaline-1
 */
public final class OptimizedRecursiveBubbleSort {
    /**
     * @implNote : recursive inner for-loop for comparisons and swapping
     * @param array : the array to be sorted
     * @param currentInnerIndex : the current inner for-loop index
     * @param currentOuterIndex : the current outer for-loop index
     * @param hasSwappingOccurred : check to avoid redundant iterations after sorting completion to implement optimization
     * @return : true (swapping occurred in one of the inner loop iterations for a outer loop index)
     *           false (swapping did not occur in one of the inner loop iterations for a outer loop index)
     * @author : quantum-adrenaline-1
     */
    private static boolean comparativeSwappingBubbleSortInnerLoop(int[] array, int currentInnerIndex, int currentOuterIndex, boolean hasSwappingOccurred) {
        if (currentInnerIndex < currentOuterIndex) {
            if (array[currentInnerIndex] > array[currentInnerIndex + 1]) {
                int swapAccumulator = array[currentInnerIndex];
                array[currentInnerIndex] = array[currentInnerIndex + 1];
                array[currentInnerIndex + 1] = swapAccumulator;
                hasSwappingOccurred = true;
            }
            return comparativeSwappingBubbleSortInnerLoop(array, currentInnerIndex + 1, currentOuterIndex, hasSwappingOccurred);
        }
        return hasSwappingOccurred;
    }

    /**
     * @implNote : outer for-loop for placing the large integers to the right one-by-one using inner for-loop
     * @param array : the array to be sorted
     * @param currentOuterIndex : the current outer for-loop index
     * @author : quantum-adrenaline-1
     */
    private static void optimizedRecursiveBubbleSort(int[] array, int currentOuterIndex) {
        if (array != null && currentOuterIndex < array.length && currentOuterIndex > 0) {
            boolean isArrayUnsorted = comparativeSwappingBubbleSortInnerLoop(array, 0, currentOuterIndex, false);
            if (isArrayUnsorted) {
                optimizedRecursiveBubbleSort(array, currentOuterIndex - 1);
            }
        }
    }

    /**
     * @implNote : 'main' method for implementing execution for 'Optimized recursive Bubble Sort' implementation in this class
     * @param args : 'runtime' string array arguments for main method
     * @author : quantum-adrenaline-1
     */
    public static void main(String[] args) {
        final int[] userArray = {3, 1, 4, 2, 9, 7, 5, 10, 31, 15};

        optimizedRecursiveBubbleSort(userArray, userArray.length - 1);

        System.out.println(Arrays.toString(userArray));
    }
}