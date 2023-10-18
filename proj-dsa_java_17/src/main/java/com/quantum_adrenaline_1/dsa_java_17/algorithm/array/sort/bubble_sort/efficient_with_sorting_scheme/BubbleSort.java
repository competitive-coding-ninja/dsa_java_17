package com.quantum_adrenaline_1.dsa_java_17.algorithm.array.sort.bubble_sort.efficient_with_sorting_scheme;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.logging.Logger;

import com.quantum_adrenaline_1.dsa_java_17.algorithm.array.sort.SortAlgorithm;

public interface BubbleSort extends SortAlgorithm {

    Logger logger = Logger.getLogger(BubbleSort.class.getCanonicalName());

    boolean comparisonSwappingInnerIterations(int[] array, int currentOuterIndex, int currentInnerIndex, boolean hasSwappingOccurred);

    static void bubbleSort(int[] userArray, SortingScheme sortingScheme) {
        final BubbleSort bubbleSort;
        if (sortingScheme == SortingScheme.ASCENDING) {
            // execute the ascending sorting logic
        } else if (sortingScheme == SortingScheme.DESCENDING) {
            bubbleSort = new RecursiveOptimizedDescendingBubbleSort();
            ((RecursiveOptimizedDescendingBubbleSort) bubbleSort).descendingBubbleSort(userArray, 0);
        }
    }

    static void printSortedArray(int[] sortedUserArray) {
        logger.info(MessageFormat.format("Sorted Array: {0}", Arrays.toString(sortedUserArray)));
    }

}
