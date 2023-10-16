package com.quantum_adrenaline_1.dsa_java_17.algorithm.array.sort.bubble_sort.recursion;

import java.util.Arrays;

/**
 * @implNote : implement conventional Bubble Sort using recursion
 * @author : quantum-adrenaline-1
 */
public final class RecursiveBubbleSort {
    /**
     * @implNote : perform the inner for loop of comparisons and swapping with recursion
     * @param array : the array to be sorted using Bubble Sort
     * @param currentInnerIndex : current index of the inner loop iteration
     * @param currentOuterIndex : current index of the outer loop iteration
     * @author : quantum-adrenaline-1
     */
    private static void comparisonSwappingInnerLoop(int[] array, int currentInnerIndex, int currentOuterIndex) {
        if (currentInnerIndex < currentOuterIndex) {
            if (array[currentInnerIndex] > array[currentInnerIndex + 1]) {
                int swapAccumulator = array[currentInnerIndex];
                array[currentInnerIndex] = array[currentInnerIndex + 1];
                array[currentInnerIndex + 1] = swapAccumulator;
            }
            comparisonSwappingInnerLoop(array, currentInnerIndex + 1, currentOuterIndex);
        }
    }

    /**
     * @implNote : implement the conventional Bubble Sort using recursion. This function handles the iterations of the outer loop
     * @param array : the array to be sorted
     * @author : quantum-adrenaline-1
     */
    private static void recursiveBubbleSort(int[] array, int currentOuterIndex) {
        if (array != null && array.length > 0 && currentOuterIndex < array.length && currentOuterIndex > 0) {
            comparisonSwappingInnerLoop(array, 0, currentOuterIndex);
            recursiveBubbleSort(array, currentOuterIndex - 1);
        }
    }

    /**
     * @implNote : 'main' method for implementing execution for 'Recursive Bubble Sort' implementation in this class
     * @param args : 'runtime' string array arguments for main method
     * @author : quantum-adrenaline-1
     */
    public static void main(String[] args) {
        final int[] userArray = {3, 1, 4, 2, 9, 7, 5};

        recursiveBubbleSort(userArray, userArray.length - 1);

        System.out.println(Arrays.toString(userArray));
    }
}
