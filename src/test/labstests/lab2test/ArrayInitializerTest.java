package labstests.lab2test;

import lab2.ArrayInitializer;
import lab2.Program;
import org.junit.Assert;
import org.junit.Test;

public class ArrayInitializerTest {
    @Test
    public void testInitializeTwoDimensionalArray() {
        ArrayInitializer arrayInitializer = new ArrayInitializer();
        Assert.assertNotNull(arrayInitializer.initializeTwoDimensionalArray(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInitializeTwoDimensionalArrayPassesNegArgument() {
        ArrayInitializer arrayInitializer = new ArrayInitializer();
        Assert.assertNotNull(arrayInitializer.initializeTwoDimensionalArray(-1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInitializeOneDimensionalArrayPassesNegArgument() {
        ArrayInitializer arrayInitializer = new ArrayInitializer();
        Assert.assertNotNull(arrayInitializer.initializeOneDimensionalArray(-1));
    }

    @Test
    public void testSolveOneDimensionalArray() {
        Program.main(new String[] {});
        Assert.assertTrue(true);
    }
}
