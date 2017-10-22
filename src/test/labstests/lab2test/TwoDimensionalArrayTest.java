package labstests.lab2test;

import lab2.ArrayPrinter;
import lab2.TwoDimensionalArraySolver;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoDimensionalArrayTest {
    private TwoDimensionalArraySolver twoDimensionalArraySolver;

    @Before
    public void before() {
        twoDimensionalArraySolver = new TwoDimensionalArraySolver(new int[][]
                {
                        {1, -2, 3},
                        {1, 4, 11},
                        {-12, 10, 4}
                });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithNullArgument() {
        new TwoDimensionalArraySolver(null);
    }

    @Test
    public void correctGetLeastElementOfMaxByModuleColumn() {
        Assert.assertEquals(twoDimensionalArraySolver.getLeastElementOfMaxByModuleColumn(), 3);
    }

    @Test
    public void correctGetMinimumsToDiagonal() {
        Assert.assertArrayEquals(twoDimensionalArraySolver.getMinimumsToDiagonal(), new int[] {1, 1, -12});
    }

    @Test
    public void correctGetFirstPositivesToDiagonal() {
        Assert.assertArrayEquals(twoDimensionalArraySolver.getFirstPositivesToDiagonal(), new int[] {1, 1, 10});
    }
}
