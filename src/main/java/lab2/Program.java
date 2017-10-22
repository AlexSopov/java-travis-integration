package lab2;

public class Program {
    public static void main(String[] args) {
        solveOneDimensionalArray(true);
        solveMultiDimensionalArray(true);
    }

    public static void solveOneDimensionalArray(boolean useDefault) {
        ArrayInitializer arrayInitializer = new ArrayInitializer();
        ArrayPrinter arrayPrinter = new ArrayPrinter();

        int arraySize = useDefault ? 5 : arrayInitializer.requestArraySize();
        int[] array = useDefault ? new int[] {1, 2, 3} : arrayInitializer.initializeOneDimensionalArray(arraySize);

        System.out.print(arrayPrinter.printArray(array));
        OneDimensionalArraySolver oneDimensionalArraySolver = new OneDimensionalArraySolver(array);

        System.out.println("The number of positive items: " + oneDimensionalArraySolver.getCountOfPositive());
        System.out.println("Sum of elements larger than 3: " + oneDimensionalArraySolver.getSumOfLargerThanThree());
        System.out.println("Maximum element of array: " + oneDimensionalArraySolver.getMaximum());
        System.out.println("The number of negative items: " + oneDimensionalArraySolver.getCountOfNegative());
        System.out.println("The sum of negative items: " + oneDimensionalArraySolver.getSumOfNegative());
        System.out.println("The minimum element that is multiple 5: " + oneDimensionalArraySolver.getMinElementMultipleFive());
    }

    public static void solveMultiDimensionalArray(boolean useDefault) {
        System.out.println();
        ArrayInitializer arrayInitializer = new ArrayInitializer();
        ArrayPrinter arrayPrinter = new ArrayPrinter();

        // 8 - by task
        int[][] array1 = arrayInitializer.initializeTwoDimensionalArray(8);
        System.out.print(arrayPrinter.printArray(array1));
        TwoDimensionalArraySolver twoDimensionalArraySolver = new TwoDimensionalArraySolver(array1);
        System.out.println("The least element of max by module column: " + twoDimensionalArraySolver.getLeastElementOfMaxByModuleColumn());

        int arraySize = useDefault ? 3 : arrayInitializer.requestArraySize();
        int[][] array2 = arrayInitializer.initializeTwoDimensionalArray(arraySize);

        System.out.print(arrayPrinter.printArray(array2));
        twoDimensionalArraySolver = new TwoDimensionalArraySolver(array2);

        System.out.println("Minimums to diagonal: ");
        System.out.print(arrayPrinter.printArray(twoDimensionalArraySolver.getMinimumsToDiagonal()));

        System.out.println("\nFirst positives to diagonal: ");
        System.out.print(arrayPrinter.printArray(twoDimensionalArraySolver.getFirstPositivesToDiagonal()));
    }
}
