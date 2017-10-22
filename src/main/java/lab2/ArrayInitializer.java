package lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class ArrayInitializer {
    private BufferedReader bufferedReader;

    public ArrayInitializer() {
        bufferedReader = new BufferedReader(
                new InputStreamReader(System.in)
        );
    }

    public int requestArraySize() {
        System.out.print("Enter an array size: ");
        int arraySize = requestInteger();

        if (arraySize < 1) {
            System.out.println("Array size must be at least 1. Try again.");
            return requestArraySize();
        }

        return arraySize;
    }
    public int[] initializeOneDimensionalArray(int length) {
        if (length < 1) {
            throw new IllegalArgumentException("Parameter length must be at least 1.");
        }

        System.out.println("Enter values of array: ");

        int[] result = new int[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = requestInteger();
        }

        return result;
    }
    public int[][] initializeTwoDimensionalArray(int length) {
        if (length < 1) {
            throw new IllegalArgumentException("Parameter length must be at least 1.");
        }

        Random random = new Random();
        int[][] result = new int[length][length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = random.nextInt() % 100;
            }
        }

        return result;
    }

    private int requestInteger() {
        int result = 0;

        try {
            result = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException ioe) {
            System.out.println("IO exception has occurred during runtime.");
            System.exit(1);
        } catch(NumberFormatException nfe) {
            System.out.println("Incorrect format of value. Try again.");
            return requestInteger();
        }

        return result;
    }
}
