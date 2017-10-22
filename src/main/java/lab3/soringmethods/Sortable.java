package lab3.soringmethods;

import java.util.Comparator;

public abstract class Sortable {
    public <T extends Comparable<T>> void sort(T[] source) {
        processSorting(source, null);
    }
    public <T> void sort(T[] source, Comparator<T> comparator) {
        processSorting(source, comparator);
    }

    public abstract String getSortingMethodName();
    protected abstract <T> void processSorting(T[] source, Comparator<T> comparator);

    protected <T> int compare(T a, T b, Comparator comparator) {
        if (comparator == null) {
            return ((Comparable)a).compareTo(b);
        }

        return comparator.compare(a, b);
    }
    protected <T> int compare(T[] source, int a, int b, Comparator comparator) {
        if (comparator == null) {
            return ((Comparable)source[a]).compareTo(source[b]);
        }

        return comparator.compare(source[a], source[b]);
    }
    protected <T> void swap(T[] x, int a, int b) {
        T temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }
}