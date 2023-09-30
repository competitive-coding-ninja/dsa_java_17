package com.quantum_adrenaline_1.dsa_java_17.data_structure.array.uninitialized.primitive.impl;

import com.quantum_adrenaline_1.dsa_java_17.data_structure.array.uninitialized.UninitializedArray;

import java.util.Scanner;
import java.util.logging.Logger;
import java.text.MessageFormat;

/**
 * @implNote : create and operate over a 'char' array
 * @author : quantum-adrenaline-1
 */
public final class UninitializedCharArray extends UninitializedArray<char[]> {
    private static final Logger logger;

    static {
        logger = Logger.getLogger(UninitializedCharArray.class.getCanonicalName());
    }

    /**
     * @implNote : create an uninitialized 'char' array
     * @return : success => an uninitialized 'char' array of size specified by the user
     *           failure => null
     * @author : quantum-adrenaline-1
     */
    @Override
    public char[] createArray() {
        try (final Scanner userInputScanner = new Scanner(System.in)) {
            logger.info("Hello user, please enter the size of the 'char' array: ");
            return new char[userInputScanner.nextInt()];
        } catch (Exception exception) {
            return null;
        }
    }

    /**
     * @implNote : traverse through and print the 'char' array
     * @param array : array argument to be traversed and printed
     * @author : quantum-adrenaline-1
     */
    @Override
    public void traverseAndPrintArray(char[] array) {
        if (array != null) {
            if (array.length > 0) {
                for (int index = 0; index < array.length; index++) {
                    logger.info(MessageFormat.format("Element {0}: {1}", index, array[index]));
                }
            } else {
                logger.info(MessageFormat.format("The array instance {0} is empty", array));
            }
        } else {
            logger.info("The array does not exist (is a null reference)");
        }
    }

}
