package com.quantum_adrenaline_1.dsa_java_17.data_structure.array.uninitialized;

/**
 * @implNote : create and perform operations on an uninitialized array
 * @param <T> : generic reference type for an array of primitive type
 * @author : quantum-adrenaline-1
 */
public abstract class UninitializedArray<T> {
    /**
     * @implNote : create type T (an array)
     * @return : success => create type T (an array)
     *           failure => null
     * @author : quantum-adrenaline-1
     */
    protected T createArray() {
        return null;
    }

    /**
     * @implNote : traverse through and print the elements of the array
     * @param array : array argument to be traversed and printed
     * @author : quantum-adrenaline-1
     */
    protected void traverseAndPrintArray(final T array) { }
}
