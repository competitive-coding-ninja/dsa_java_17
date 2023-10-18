package com.quantum_adrenaline_1.dsa_java_17.algorithm.array.sort.bubble_sort.efficient_with_sorting_scheme;

public final class RecursiveOptimizedAscendingBubbleSort implements AscendingBubbleSort {
    @Override
    public void swap(int[] array, int currentIndex) {
        if (array[currentIndex] > array[currentIndex + 1]) {
            int swapAccumulator = array[currentIndex];
            array[currentIndex] = array[currentIndex + 1];
            array[currentIndex + 1] = swapAccumulator;
        }
    }

    @Override
    public boolean comparisonSwappingInnerIterations(int[] array, int currentOuterIndex, int currentInnerIndex, boolean hasSwappingOccurred) {
        if (currentInnerIndex < currentOuterIndex) {
            // compare and swap elements
            swap(array, currentInnerIndex);
            hasSwappingOccurred = true;
            return comparisonSwappingInnerIterations(array, currentOuterIndex, currentInnerIndex + 1, hasSwappingOccurred);
        }
        return hasSwappingOccurred;
    }

    @Override
    public void ascendingBubbleSort(int[] array, int currentOuterIndex) {
        if (array != null && array.length > 0) {
            if (currentOuterIndex > 0) {
                boolean isArrayUnsorted = comparisonSwappingInnerIterations(array, currentOuterIndex, 0, false);
                if (isArrayUnsorted) ascendingBubbleSort(array, currentOuterIndex - 1);
            }
        }
    }
}
