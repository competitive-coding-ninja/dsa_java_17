package com.quantum_adrenaline_1.dsa_java_17.algorithm.array.search.binary_search;

/**
 * @implNote : 'main' class for executing 'Binary Search' algorithm implementations in this package
 * @author : quantum-adrenaline-1
 */
public class Main {

    /**
     * @implNote : 'main' method for implementing execution for 'Binary Search' implementations in this package
     * @param args : 'runtime' string array arguments for main method
     */
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int searchKey = 72;

        int result = BinarySearchImpl.binarySearch(array, searchKey);

        if (result == -1) {
            System.out.println("Search key not found in the array.");
        } else {
            System.out.println("Search key found at index: " + result);
        }
    }
}
