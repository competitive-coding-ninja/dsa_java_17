package com.quantum_adrenaline_1.dsa_java_17.problems.array.search.linear_search.practice;

/*

+ The time and space complexity of this Java code is the same as the time and space complexity of the linear search algorithm in general.

+ Time complexity:
    Best case: O(1) - occurs when the search key is found at the beginning of the array
    Average case: O(n/2) - occurs when the search key is found in the middle of the array
    Worst case: O(n) - occurs when the search key is not found in the array

+ Space complexity
    O(1)

+ Explanation
    - The time complexity of the linear search algorithm is O(n) in the worst case because the algorithm may need to compare the search key to every element in the array in order to find it, or to determine that it is not present.
    - The space complexity of the linear search algorithm is O(1) because it does not require any additional space beyond the input array.
*/

/**
 * @implNote : conventional linear search implementation for practice
 * @author : quantum-adrenaline-1
 */
public final class LinearSearch {
    /**
     * @implNote : conventional linear search implementation for practice using iterative approach
     * @param userArray : the user input array to be searched for the 'searchKey'
     * @param searchKey : the key to be searched in the 'userArray'
     * @return success (the 'searchKey' is found in the 'userArray') : the index of the location of 'searchKey' in 'userArray'
     *         failure (the searchKey is not found in the 'userArray') : -1
     */
    private static int linearSearch(int[] userArray, int searchKey) {
        if (userArray != null && userArray.length > 0) {
            for (int index = 0; index < userArray.length; index++) {
                if (userArray[index] == searchKey) {
                    return index;
                }
            }
        }
        return -1;
    }

    /**
     * @implNote : 'main' method for Linear Search execution in this class
     * @param args : 'runtime' string array arguments for main method
     * @author : quantum-adrenaline-1
     */
    public static void main(String[] args) {
        final int[] userArray = {12, 9, 10, 32, 54, 18, 63, 98};

        final int searchKey = 98;

        final int keyIndex = linearSearch(userArray, searchKey);

        if (keyIndex != -1) {
            System.out.printf("%d is found at index %d\n", searchKey, keyIndex);
        } else {
            System.out.printf("%d is not in the array\n", searchKey);
        }
    }
}
