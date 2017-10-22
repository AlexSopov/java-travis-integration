package labstests.lab2test;

import lab2.ArrayPrinter;
import org.junit.Assert;
import org.junit.Test;

public class ArrayPrinterTest {
    @Test
    public void printOneDimArray() {
        int[] data = new int[] {1, 2, 3};
        ArrayPrinter arrayPrinter = new ArrayPrinter();

        Assert.assertEquals("Printed result is incorrect.", "1\t2\t3\t\n", arrayPrinter.printArray(data));
    }

    @Test
    public void printTwoDimArray() {
        int[][] data = new int[][] {{1, 2}, {3, 4}};
        ArrayPrinter arrayPrinter = new ArrayPrinter();

        Assert.assertEquals("Printed result is incorrect.", "1\t2\t\n3\t4\t\n", arrayPrinter.printArray(data));
    }
}
