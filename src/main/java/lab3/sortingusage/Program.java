package lab3.sortingusage;
import lab3.soringmethods.*;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        int arrayLength;
        Integer[] data;

        try
        {
            arrayLength = parseArguments(args);
            data = initializeRandomArray(arrayLength);
        }
        catch (NumberFormatException numberFormatException) {
            System.out.println("First parameter should be integer.");
            return;
        }
        catch (NegativeArraySizeException negativeArraySizeException) {
            System.out.println("An array size should be greater than 0.");
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(illegalArgumentException.getMessage());
            return;
        }

        SortingMetricsCollector sortingMetricsCollector = new SortingMetricsCollector();
        sortingMetricsCollector.getMetricsForSort(new BubbleSorter(), data);
        sortingMetricsCollector.getMetricsForSort(new InsertionSorter(), data);
        sortingMetricsCollector.getMetricsForSort(new QuickSorter(), data);
        sortingMetricsCollector.getMetricsForSort(new CycleSorter(), data);
        sortingMetricsCollector.getMetricsForSort(new ShellSorter(), data);
        sortingMetricsCollector.getMetricsForSort(new JavaNativeSorter(), data);
    }

    public static int parseArguments(String[] args) {
        int arrayLength;
        if (args.length > 1) {
            throw new IllegalArgumentException("Main takes only one argument.");
        }

        if (args.length == 1) {
            arrayLength = Integer.parseInt(args[0]);
        }
        else {
            arrayLength = 1000;
        }

        return  arrayLength;
    }

    private static Integer[] initializeRandomArray(int length) {
        Random random = new Random();

        Integer[] result = new Integer[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt() % 100;
        }

        return result;
    }
}
