package com.quantum_adrenaline_1.dsa_java_17.data_structure.array.uninitialized.primitive.impl;

import com.quantum_adrenaline_1.dsa_java_17.data_structure.array.uninitialized.UninitializedArray;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.Scanner;
import java.text.MessageFormat;

/**
 * @implNote : create and operate over an uninitialized 'int' array
 * @author : quantum-adrenaline-1
 */
public final class UninitializedIntArray extends UninitializedArray<int[]> {
    private static final Logger logger;

    static {
        logger = Logger.getLogger(UninitializedArray.class.getCanonicalName());
    }

    /**
     * @implNote : create an uninitialized 'int' array
     * @return : success => uninitialized 'int' array of size specified by the user
     *           failure => null
     * @author : quantum-adrenaline-1
     */
    @Override
    public int[] createArray() {
        try (final Scanner userInputScanner = new Scanner(System.in)) {
            logger.log(Level.INFO, "Hello user, please enter the size for your 'int' array: ");
            return new int[userInputScanner.nextInt()];
        } catch (final Exception exception) {
            return null;
        }
    }

    /**
     * @implNote : traverse through and print the 'int' array
     * @param array : array argument to be traversed and printed
     * @author : quantum-adrenaline-1
     */
    @Override
    public void traverseAndPrintArray(final int[] array) throws NullPointerException {
        if (array != null) {
            if (array.length > 0) {
                logger.log(Level.INFO, "Okay user, these are the elements of your array: ");
                for (int index = 0; index < array.length; index++) {
                    logger.log(Level.INFO, MessageFormat.format("Element {0}: {1}", index, array[index]));
                }
            } else {
                logger.log(Level.INFO, MessageFormat.format("The array instance {0} is empty", array));
            }
        } else {
            logger.log(Level.INFO, "The array does not exists (is a null reference)");
        }
    }
}
