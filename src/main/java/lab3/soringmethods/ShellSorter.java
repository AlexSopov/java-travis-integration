package lab3.soringmethods;

import java.util.Comparator;

public class ShellSorter extends Sortable {
    @Override
    public <T> void processSorting(T[] source, Comparator<T> comparator) {
        int length = source.length;

        for (int gap = source.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < length; i += 1) {
                T temp = source[i];

                int j;
                for (j = i; j >= gap && compare(source[j - gap], temp, comparator) > 0; j -= gap) {
                    source[j] = source[j - gap];
                }

                source[j] = temp;
            }
        }
    }

    @Override
    public String getSortingMethodName() {
        return "Shell sort";
    }
}
