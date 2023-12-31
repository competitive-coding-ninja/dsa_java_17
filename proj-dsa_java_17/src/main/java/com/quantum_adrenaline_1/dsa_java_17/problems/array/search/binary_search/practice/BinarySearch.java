package com.quantum_adrenaline_1.dsa_java_17.problems.array.search.binary_search.practice;

/*

The conventional binary search algorithm and the optimized binary search algorithm in your code both have the same time and space complexity. However, the optimized binary search algorithm has a few advantages over the conventional one:

    1. The optimized algorithm has a faster search time than the conventional algorithm because it eliminates the need to check for the search key at every iteration of the loop. Instead, it checks for the key only at the beginning and end of each iteration, which reduces the number of comparisons required.

    2. The optimized algorithm has a lower probability of overflow errors than the conventional algorithm because it uses (firstIndex + lastIndex) / 2 to calculate the center index instead of (firstIndex + lastIndex) >> 1. The latter method can cause overflow errors when firstIndex and lastIndex are large integers.

    3. The optimized algorithm has a better worst-case performance than the conventional algorithm because it reduces the number of iterations required to find the search key. In the worst case, where the search key is not present in the array, both algorithms have a time complexity of O(log n), but the optimized algorithm requires fewer iterations to reach this conclusion.

*/

/**
 * @implNote : practice implementation of the conventional and the optimized versions of the Binary Search algorithm with the driver main() method
 * @author : quantum-adrenaline-1
 */
public final class BinarySearch {
    /**
     * @implNote : check if the search key for the array is within the lowest and the highest bounds of the array
     * @param userArray : the 'int' array in which the key is to be searched
     * @param searchKey : the key to be searched in the 'int' array
     * @return success (if the search key is equals to or between the lower and the upper bounds of the array) : true
     *         failure (if the search key is out of the lower and the upper bounds of the array) : false
     * @author : quantum-adrenaline-1
     */
    private static boolean isKeyWithinArrayBounds(int[] userArray, int searchKey) {
        if (userArray != null && userArray.length > 0) {
            return searchKey >= userArray[0] && searchKey <= userArray[userArray.length - 1];
        }
        return false;
    }

    /**
     * @implNote : conventional Binary Search algorithm to search the desired search key
     * @param userArray : the 'int' array in which the key is to be searched
     * @param searchKey : the key to be searched in the 'int' array
     * @return success (if the search key is found in the array) : index of the search key in the array
     *         failure (if the search key is not found in the array) : -1
     * @author : quantum-adrenaline-1
     */
    private static int binarySearch(int[] userArray, int searchKey) {
        if (userArray != null && userArray.length > 0) {
            int firstIndex = 0;
            int lastIndex = userArray.length - 1;
            int centerIndex;

            while (lastIndex >= firstIndex + 1) {
                centerIndex = (firstIndex + lastIndex) / 2;
                if (isKeyFoundAtIndex(userArray, centerIndex, searchKey)) {
                    return centerIndex;
                }
                if (searchKey < userArray[centerIndex]) {
                    lastIndex = centerIndex - 1;
                } else if (searchKey > userArray[centerIndex]) {
                    firstIndex = centerIndex + 1;
                }
            }
        }
        return -1;
    }

    /**
     * @implNote : check if the element at 'index' param is equal to the 'searchKey' param
     * @param userArray : the 'int' array in which the key is to be searched
     * @param index : the targeted 'index' location for the searchKey comparison
     * @param searchKey : the key to be searched in the 'int' array
     * @return success (if the element present at 'index' equals the 'searchKey') : true
     *         failure (if the element present at 'index' does not equal the 'searchKey') : false
     * @author : quantum-adrenaline-1
     */
    private static boolean isKeyFoundAtIndex(int[] userArray, int index, int searchKey) {
        return userArray[index] == searchKey;
    }

    /**
     * @implNote : optimized version of the conventional Binary Search algorithm to search the desired search key
     * @param userArray : the 'int' array in which the key is to be searched
     * @param searchKey : the key to be searched in the 'int' array
     * @return success (if the search key is found in the array) : index of the search key in the array
     *         failure (if the search key is not found in the array) : -1
     * @author : quantum-adrenaline-1
     */
    private static int optimizedBinarySearch(int[] userArray, int searchKey) {
        if (userArray != null && userArray.length > 0 && isKeyWithinArrayBounds(userArray, searchKey)) {
            int firstIndex = 0;
            int lastIndex = userArray.length - 1;
            int centerIndex;

            while (lastIndex >= firstIndex + 1) {
                if (isKeyFoundAtIndex(userArray, firstIndex, searchKey)) {
                    return firstIndex;
                } else if (isKeyFoundAtIndex(userArray, lastIndex, searchKey)) {
                    return lastIndex;
                }

                centerIndex = (firstIndex + lastIndex) / 2;

                if (isKeyFoundAtIndex(userArray, centerIndex, searchKey)) {
                    return centerIndex;
                }

                if (searchKey < userArray[centerIndex]) {
                    lastIndex = centerIndex - 1;
                } else if (searchKey > userArray[centerIndex]) {
                    firstIndex = centerIndex + 1;
                }
            }
        }
        return -1;
    }

    /**
     * @implNote : 'main' method for implementing execution for 'Binary Search' implementations in this class
     * @param args : 'runtime' string array arguments for main method
     * @author : quantum-adrenaline-1
     */
    public static void main(String[] args) {
        final int[] userArray = {1, 3, 5, 8, 13, 16, 52, 84, 96};

        final int searchKey = 3;

        final int keyIndex = optimizedBinarySearch(userArray, searchKey);

        if (keyIndex != -1) {
            System.out.printf("%d is found at index %d\n", searchKey, keyIndex);
        } else {
            System.out.printf("%d is not found in the array\n", searchKey);
        }
    }
}
