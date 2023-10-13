package com.quantum_adrenaline_1.dsa_java_17.algorithm.array.search.linear_search.recursion;

/**
 * @implNote : linear search for array using recursion
 * @author : quantum-adrenaline-1
 */
public final class RecursiveLinearSearch {
    /**
     * @implNote : linear search on 'int' array using recursion
     * @param array : 'int' array in which key is to be searched
     * @param searchKey : 'int' type key to be searched in the 'int' array
     * @param index : 'accumulator' for current array index to search linearly using recursion
     * @return success (param 'searchKey' is found in the array) : index of the location of searchKey inside the array
     *         failure (param 'searchKey' is not found in the array) : -1
     * @author : quantum-adrenaline-1
     */
    private static int recursiveLinearSearch(int[] array, int searchKey, int index) {
        if (array != null && array.length > 0 && index >= 0) {
            if (index > array.length - 1) {
                return -1;
            } else {
                if (array[index] == searchKey) {
                    return index;
                } else {
                    return recursiveLinearSearch(array, searchKey, ++index);
                }
            }
        }
        return -1;
    }

    /**
     * @implNote : 'main' method to implement the usage of function 'recursiveLinearSearch'
     * @param args : 'runtime' string array arguments for main method
     * @author : quantum-adrenaline-1
     */
    public static void main(String[] args) {
        final int[] array = {5, 7, 1, 3, 2, 13, 17, 98, 81};

        final int searchKey = 1;

        final int keyIndex = recursiveLinearSearch(array, searchKey, 0);

        if (keyIndex != -1) {
            System.out.printf("%d is found at %d index\n", searchKey, keyIndex);
        } else {
            System.out.printf("%d is not found in the array\n", searchKey);
        }
    }
}
