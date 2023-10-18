package com.quantum_adrenaline_1.dsa_java_17.algorithm.array.sort.bubble_sort.efficient_with_sorting_scheme;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.text.MessageFormat;

public class ExecBubbleSort {
    public static final Logger logger;

    static {
        logger = Logger.getLogger(ExecBubbleSort.class.getCanonicalName());
    }

    public static void main(String[] args) {
        try (
                final Scanner inputScanner = new Scanner(System.in)
        ) {
            SortingScheme sortingScheme;
            logger.info("Dear user, please enter the size of your array:");
            int arraySize = inputScanner.nextInt();
            int[] userArray = new int[arraySize];
            logger.info("Please fill in the array elements (preferably in an unsorted manner):");
            for (int index = 0; index < userArray.length; index++) {
                logger.info(MessageFormat.format("element {0}", index + 1));
                userArray[index] = inputScanner.nextInt();
            }
            logger.info("""
                    We have the following sorting schemes:
                    1. Ascending
                    2. Descending
                    
                    Please enter your choice:
                    """);
            int sortingSchemeChoice = inputScanner.nextInt();
            if (sortingSchemeChoice == 1) {
                sortingScheme = SortingScheme.ASCENDING;
            } else if (sortingSchemeChoice == 2) {
                sortingScheme = SortingScheme.DESCENDING;
            } else {
                logger.log(Level.SEVERE, "Sorry, your sorting scheme choice is incorrect. Please try again..");
                return;
            }
            BubbleSort.bubbleSort(userArray, sortingScheme);
            BubbleSort.printSortedArray(userArray);
        }
    }
}
