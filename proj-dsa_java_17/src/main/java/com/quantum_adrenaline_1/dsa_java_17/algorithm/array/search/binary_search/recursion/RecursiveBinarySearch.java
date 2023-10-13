package com.quantum_adrenaline_1.dsa_java_17.algorithm.array.search.binary_search.recursion;

/**
 * @implNote : Binary Search (conventional Binary Search algorithm) for array using recursion
 * @author : quantum-adrenaline-1
 */
public final class RecursiveBinarySearch {
    /**
     * @implNote : check if the search key is between the smallest (first element) element and the largest (last element) element of the sorted input array
     * @param array : the sorted array to be recursively searched with the search key using Binary Search
     * @param searchKey : the key to be searched recursively in the sorted array using Binary Search
     * @return success (the search key is between the smallest and the largest integer element in the array) : true
     *         failure (the search key is either greater than the largest element or less than the smallest element) : false
     * @author : quantum-adrenaline-1
     */
    private static boolean isKeyWithinArrayBounds(int[] array, int searchKey) {
        if (array != null && array.length > 0) {
            return searchKey >= array[0] && searchKey <= array[array.length - 1];
        }
        return false;
    }

    /**
     * @implNote : Binary
     * @param array : the sorted array to be recursively searched with the search key using Binary Search
     * @param searchKey : the key to be searched recursively in the sorted array using Binary Search
     * @param firstIndex : the lower element index/pointer for the current sub-array
     * @param lastIndex : the greater element index/pointer for the current sub-array
     * @return success (the search key is found in the array) : index of the location of the search key in the array
     *         failure (the search key is not found in the array) : -1
     * @author : quantum-adrenaline-1
     */
    private static int recursiveBinarySearch(int[] array, int searchKey, int firstIndex, int lastIndex) {
        if (array != null && array.length > 0 && isKeyWithinArrayBounds(array, searchKey)) {
            if (searchKey == array[firstIndex]) {
                return firstIndex;
            } else if (searchKey == array[lastIndex]) {
                return lastIndex;
            }
            if (lastIndex >= firstIndex + 1) {
                int centerIndex = (firstIndex + lastIndex) / 2;
                if (searchKey == array[centerIndex]) {
                    return centerIndex;
                } else if (searchKey < array[centerIndex]) {
                    return recursiveBinarySearch(array, searchKey, firstIndex, centerIndex - 1);
                } else {
                    return recursiveBinarySearch(array, searchKey, centerIndex + 1, lastIndex);
                }
            }
        }
        return -1;
    }

    /**
     * @implNote : 'main' method for implementing execution for 'Binary Search' recursively in this class
     * @param args : 'runtime' string array arguments for main method
     */
    public static void main(String[] args) {
        final int[] userArray = {1, 7, 8, 9, 16, 54, 78, 91};

        final int searchKey = 54;

        final int keyIndex = recursiveBinarySearch(userArray, searchKey, 0, userArray.length - 1);

        if (keyIndex != -1) {
            System.out.printf("%d is found at index %d\n", searchKey, keyIndex);
        } else {
            System.out.printf("%d is not found in the array\n", searchKey);
        }
    }
}
