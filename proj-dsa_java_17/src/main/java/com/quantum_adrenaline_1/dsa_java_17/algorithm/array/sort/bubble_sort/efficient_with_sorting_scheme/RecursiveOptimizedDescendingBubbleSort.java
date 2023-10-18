package com.quantum_adrenaline_1.dsa_java_17.algorithm.array.sort.bubble_sort.efficient_with_sorting_scheme;

public final class RecursiveOptimizedDescendingBubbleSort implements DescendingBubbleSort {

    @Override
    public void swap(int[] array, int currentIndex) {
        if (array[currentIndex] > array[currentIndex - 1]) {
            int swapAccumulator = array[currentIndex];
            array[currentIndex] = array[currentIndex - 1];
            array[currentIndex - 1] = swapAccumulator;
        }
    }

    @Override
    public boolean comparisonSwappingInnerIterations(int[] array, int currentOuterIndex, int currentInnerIndex, boolean hasSwappingOccurred) {
        if (currentInnerIndex > currentOuterIndex) {
            if (array[currentInnerIndex] > array[currentInnerIndex - 1]) {
                swap(array, currentInnerIndex);
                hasSwappingOccurred = true;
            }
            return comparisonSwappingInnerIterations(array, currentOuterIndex, currentInnerIndex - 1, hasSwappingOccurred);
        }
        return hasSwappingOccurred;
    }

    @Override
    public void descendingBubbleSort(int[] array, int currentOuterIndex) {
        if (array != null && array.length > 0) {
            if (currentOuterIndex < array.length - 1) {
                boolean isArraySorting = comparisonSwappingInnerIterations(array, currentOuterIndex, array.length - 1, false);
                if (isArraySorting) descendingBubbleSort(array, currentOuterIndex + 1);
            }
        }
    }

}
