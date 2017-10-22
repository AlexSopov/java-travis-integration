package lab3.soringmethods;

import java.util.Comparator;

public class QuickSorter extends Sortable {
    @Override
    public <T> void processSorting(T[] source, Comparator<T> comparator) {
        quickSort(source, 0, source.length - 1, comparator);
    }

    private <T> void quickSort(T[] source, int leftLimit, int rightLimit, Comparator<T> comparator) {
        T middleValue = source[(leftLimit + rightLimit) / 2];
        int index1 = leftLimit;
        int index2 = rightLimit;

        while (index1 <= index2)
        {
            while (index1 < rightLimit && compare(source[index1], middleValue, comparator) < 0) {
                index1++;
            }
            while (index2 > leftLimit && compare(source[index2], middleValue, comparator) > 0) {
                index2--;
            }

            if (index1 <= index2) {
                if (index1 < index2) {
                    swap(source, index1, index2);
                }
                index1++;
                index2--;
            }
        }

        if (index1 < rightLimit) {
            quickSort(source, index1, rightLimit, comparator);
        }
        if (index2 > leftLimit) {
            quickSort(source, leftLimit, index2, comparator);
        }
    }

    @Override
    public String getSortingMethodName() {
        return "Quick sort";
    }
}
