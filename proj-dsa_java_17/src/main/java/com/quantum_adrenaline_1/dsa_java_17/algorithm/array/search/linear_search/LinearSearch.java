package com.quantum_adrenaline_1.dsa_java_17.algorithm.array.search.linear_search;

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
 * @implNote : search a targeted key in an array using 'Linear' search algorithm
 * @author : quantum-adrenaline-1
 */
public final class LinearSearch {
    /**
     * @implNote : search the targeted key in the 'int' array using 'Linear' search algorithm
     * @param array : the array in which key is to be searched
     * @param key : the key to be searched in the array
     * @return : success => the location index of the targeted key in the array
     *           failure => -1 (targeted index is not present in the array or if the array is null or empty)
     * @author : quantum-adrenaline-1
     */
    public static int linearSearch(int[] array, int key) {
        if (array != null && array.length > 0) {
            for (int index = 0; index < array.length; index++) {
                if (array[index] == key) return index;
            }
        }
        return -1;
    }
}
