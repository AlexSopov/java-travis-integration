package lab3.soringmethods;

import java.util.Comparator;


public class BubbleSorter extends Sortable {
    @Override
    public <T> void processSorting(T[] source, Comparator<T> comparator) {

        for (int i = source.length - 1; i >= 0; i--) {

            for (int j = 0; j < i; j++) {
                if (compare(source, j, j + 1, comparator) > 0) {
                    swap(source, j, j + 1);
                }
            }
        }
    }

    @Override
    public String getSortingMethodName() {
        return "Bubble sort";
    }
}
