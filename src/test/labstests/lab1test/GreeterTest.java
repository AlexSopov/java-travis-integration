package labstests.lab1test;

import lab1.Greeter;
import lab1.Program;
import org.junit.Assert;
import org.junit.Test;

public class GreeterTest {

    @Test
    public void greeterGreetsCorrect() {
        Assert.assertTrue("Hello, World!".equalsIgnoreCase(new Greeter().greet()));
    }

    @Test
    public void mainPasses() {
        Program.main(new String[] {});
        Assert.assertTrue(true);
    }
}
