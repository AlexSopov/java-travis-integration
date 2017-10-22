package lab3.sortingusage;

class SortingMetricsProvider {
    private long timeStart;
    private long memoryStart;
    private long timeEnd;
    private long memoryEnd;

    public void metricsStart() {
        timeStart = System.currentTimeMillis();
        memoryStart = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }
    public void metricsEnd() {
        timeEnd = System.currentTimeMillis();
        memoryEnd = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

    public long getTime() {
        return timeEnd - timeStart;
    }
    public long getMemory() {
        return memoryEnd - memoryStart;
    }
}
