package com.quantum_adrenaline_1.dsa_java_17.algorithm.array.search.binary_search;

/**
 * @implNote : search the targeted key in the array using 'Binary' Search algorithm
 * @author : quantum-adrenaline-1
 */
public final class BinarySearchImpl {
    /**
     * @implNote : check if the search key is between or equal to the lowest integer and/or the highest integer in the search array
     * @param userArray : the array in which key is to be searched
     * @param searchKey : the index to be asserted for possessing the search key
     * @return success (search key is between or equal to the lowest and the highest bound of the search array) : true
     *         failure (search key is lesser than the lowest bound and higher than the highest bound of the search array) : false
     * @author : quantum-adrenaline-1
     */
    private static boolean isKeyWithinArrayBounds(int[] userArray, int searchKey) {
        if (userArray != null && userArray.length > 0) {
            return searchKey >= userArray[0] && searchKey <= userArray[userArray.length - 1];
        }
        return false;
    }

    /**
     * @implNote : check if the element at targeted index equals search key
     * @param array : the array in which key is to be searched
     * @param targetIndex : the index to be asserted for possessing the search key
     * @param searchKey : the key to be searched in the array
     * @return success (search key present at the targeted index) : true
     *         failure (search key absent at the targeted index) : false
     * @author : quantum-adrenaline-1
     */
    private static boolean checkArrayElement(int[] array, int targetIndex, int searchKey) {
        return array[targetIndex] == searchKey;
    }

    /**
     * @implNote : search the targeted key in the 'int' array using 'Binary' Search algorithm
     * @param userArray : the array in which key is to be searched
     * @param searchKey : the key to be searched in the array
     * @return success : the location index of the targeted key in the array
     *         failure : -1 (the targeted key is not present in the array or the array is empty or null)
     * @author : quantum-adrenaline-1
     */
    public static int binarySearch(int[] userArray, int searchKey) {
        if (userArray != null && userArray.length > 0 && isKeyWithinArrayBounds(userArray, searchKey)) {
            int firstIndex = 0;
            int lastIndex = userArray.length - 1;
            int centerIndex;

            while (lastIndex >= firstIndex + 1) {
                if (checkArrayElement(userArray, lastIndex, searchKey)) {
                    return lastIndex;
                } else if (checkArrayElement(userArray, firstIndex, searchKey)) {
                    return firstIndex;
                }

                centerIndex = (firstIndex + lastIndex) / 2;

                if (checkArrayElement(userArray, centerIndex, searchKey)) {
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
}
