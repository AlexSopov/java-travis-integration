package labstests.lab2test;

import lab2.ArrayPrinter;
import lab2.OneDimensionalArraySolver;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OneDimensionalArrayTest {
    private OneDimensionalArraySolver oneDimensionalArraySolver;

    @Before
    public void before() {
        oneDimensionalArraySolver = new OneDimensionalArraySolver(new int[] {1, -4, 11, 112, -10, 5});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithNullArgument() {
        new OneDimensionalArraySolver(null);
    }

    @Test
    public void correctGetCountOfPositive() {
        Assert.assertEquals(oneDimensionalArraySolver.getCountOfPositive(), 4);
    }

    @Test
    public void correctGetSumOfLargerThanThree() {
        Assert.assertEquals(oneDimensionalArraySolver.getSumOfLargerThanThree(), 128);
    }

    @Test
    public void correctGetMaximum() {
        Assert.assertEquals(oneDimensionalArraySolver.getMaximum(), 112);
    }

    @Test
    public void correctGetSumOfNegative() {
        Assert.assertEquals(oneDimensionalArraySolver.getSumOfNegative(), -14);
    }

    @Test
    public void correctGetMinElementMultipleFive() {
        Assert.assertEquals(oneDimensionalArraySolver.getMinElementMultipleFive(), -10);
    }

    @Test
    public void correctGetCountOfNegative() {
        Assert.assertEquals(oneDimensionalArraySolver.getCountOfNegative(), 2);
    }
}
