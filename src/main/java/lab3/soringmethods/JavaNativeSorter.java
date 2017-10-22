package lab3.soringmethods;

import java.util.Arrays;
import java.util.Comparator;

public class JavaNativeSorter extends Sortable {
    @Override
    public <T> void processSorting(T[] source, Comparator<T> comparator) {
        Arrays.sort(source, comparator);
    }

    @Override
    public String getSortingMethodName() {
        return "Arrays sort";
    }
}
