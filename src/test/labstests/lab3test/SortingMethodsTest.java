package labstests.lab3test;

import lab3.soringmethods.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class SortingMethodsTest {
    private static Integer[] source;
    private Integer[] temporarySource;

    @BeforeClass
    public static void initialize() {
        Random random = new Random();

        source = new Integer[10];
        for (int i = 0; i < source.length; i++) {
            source[i] = random.nextInt() % 100;
        }
    }

    @Before
    public  void  before() {
        temporarySource = Arrays.copyOf(source, source.length);
    }

    @Test
    public void bubbleSortSortsArrayTest() {
        sort(new BubbleSorter(), temporarySource);
    }

    @Test
    public void cycleSortSortsArrayTest() {
        sort(new CycleSorter(), temporarySource);
    }

    @Test
    public void insertionSortSortsArrayTest() {
        sort(new InsertionSorter(), temporarySource);
    }

    @Test
    public void javaNativeSortSortsArrayTest() {
        sort(new JavaNativeSorter(), temporarySource);
    }

    @Test
    public void quickSortSortsArrayTest() {
        sort(new QuickSorter(), temporarySource);
    }

    @Test
    public void shellSortSortsArrayTest() {
        sort(new ShellSorter(), temporarySource);
    }

    private void sort(Sortable sortable, Integer[] source) {
        sortable.sort(source);
        assertSorting(sortable, source, false);

        temporarySource = Arrays.copyOf(source, source.length);
        sortable.sort(source, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        assertSorting(sortable, source, true);
    }

    private void assertSorting(Sortable sortable, Integer[] source, boolean comparator) {
        for (int i = 1; i < temporarySource.length; i++ ) {
            Assert.assertTrue(String.format("Array is not sorted, using \"%s\" soring method, using %s comparator.",
                    sortable.getSortingMethodName(),
                    comparator ? "custom" : "default"),
                    temporarySource[i] >= temporarySource[i - 1]);
        }
    }

}