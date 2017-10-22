package lab3.sortingusage;

import lab3.soringmethods.Sortable;

import java.util.Arrays;

class SortingMetricsCollector {

    private SortingMetricsProvider sortingMetricsProvider;

    SortingMetricsCollector() {
        sortingMetricsProvider = new SortingMetricsProvider();
    }

    public <T extends Comparable<T>> void getMetricsForSort(Sortable sortable, T[] source) {
        T[] sourceCopy = Arrays.copyOf(source, source.length);

        sortingMetricsProvider.metricsStart();
        sortable.sort(sourceCopy);
        sortingMetricsProvider.metricsEnd();

        showMetrics(sortable);
    }

    private void showMetrics(Sortable sortable) {
        System.out.format("Metrics for %s:%n" +
                "Sorting time (ms): %5d%n" +
                "Memory usage (b): %5d%n%n",
                sortable.getSortingMethodName(),
                sortingMetricsProvider.getTime(),
                sortingMetricsProvider.getMemory());
    }
}
