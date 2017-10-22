package labstests.lab3test;

import lab3.sortingusage.Program;
import org.junit.Assert;
import org.junit.Test;

public class SortingMethodsUsageTest {
    @Test
    public void parseEmptyArguments() {
        Program.parseArguments(new String[] {});
        Assert.assertTrue(true);
    }

    @Test
    public void parseOneArgument() {
        Program.parseArguments(new String[] {"100"});
        Assert.assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseMoreThanOneArgument() {
        Program.parseArguments(new String[] {"100", "200"});
    }

    @Test(expected = NumberFormatException.class)
    public void parseBadArgument() {
        Program.parseArguments(new String[] {"das"});
    }

    @Test
    public void callMainWithOneArgument() {
        Program.main(new String[] {"1000"});
        Assert.assertTrue(true);
    }

    @Test
    public void callMainWithBadArg() {
        Program.main(new String[] {"test"});
        Assert.assertTrue(true);
    }

    @Test
    public void callMainWithNegArg() {
        Program.main(new String[] {"-1"});
        Assert.assertTrue(true);
    }

    @Test
    public void callMainWithTwoArgs() {
        Program.main(new String[] {"11", "111"});
        Assert.assertTrue(true);
    }
}
