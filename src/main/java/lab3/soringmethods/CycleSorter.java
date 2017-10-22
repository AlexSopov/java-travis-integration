package lab3.soringmethods;

import java.util.Comparator;

public class CycleSorter extends Sortable {
    @Override
    public <T> void processSorting(T[] source, Comparator<T> comparator) {
        int length = source.length;

        for (int cycleStart = 0; cycleStart < length - 1; cycleStart++)
        {
            T item = source[cycleStart];

            int currentPosition = cycleStart;
            for (int j = cycleStart + 1; j < length; j++) {
                if (compare(source[j], item, comparator) < 0) {
                    currentPosition++;
                }
            }

            if (currentPosition == cycleStart) {
                continue;
            }

            while (compare(item, source[currentPosition], comparator) == 0) {
                currentPosition += 1;
            }

            if (currentPosition != cycleStart) {
                T temp = item;
                item = source[currentPosition];
                source[currentPosition] = temp;
            }

            while (currentPosition != cycleStart)
            {
                currentPosition = cycleStart;

                for (int j = cycleStart + 1; j < length; j++) {

                    if (compare(source[j], item, comparator) < 0) {
                        currentPosition += 1;
                    }
                }

                while (compare(item, source[currentPosition], comparator) == 0) {
                    currentPosition += 1;
                }

                if (compare(item, source[currentPosition], comparator) != 0) {
                    T temp = item;
                    item = source[currentPosition];
                    source[currentPosition] = temp;
                }
            }
        }
    }

    @Override
    public String getSortingMethodName() {
        return "Cycle sort";
    }
}
