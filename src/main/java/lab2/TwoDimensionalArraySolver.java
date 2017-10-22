package lab2;

public class TwoDimensionalArraySolver {
    private int[][] arrayData;

    public TwoDimensionalArraySolver(int[][] data) {
        if (data == null) {
            throw new IllegalArgumentException("Data can't be null");
        }

        arrayData = data;
    }

    public int getLeastElementOfMaxByModuleColumn() {
        int [] dataOfMaxByModuleColumn = new int[arrayData[0].length];
        int maxByModuleColumn = getMaxByModuleColumn();

        for (int i = 0; i < arrayData.length; i++) {
            dataOfMaxByModuleColumn[i] = arrayData[i][maxByModuleColumn];
        }

        return getMin(dataOfMaxByModuleColumn);
    }
    public int[] getMinimumsToDiagonal() {
        int[] minimumsToDiagonal = new int[arrayData[0].length];

        for (int i = 0; i < arrayData.length; i++) {
            int[] currentRowToDiagonalData = new int[i + 1];
            System.arraycopy(arrayData[i], 0, currentRowToDiagonalData, 0, i + 1);
            minimumsToDiagonal[i] = getMin(currentRowToDiagonalData);
        }

        return minimumsToDiagonal;
    }
    public int[] getFirstPositivesToDiagonal() {
        int[] positivesToDiagonal = new int[arrayData[0].length];

        for (int i = 0; i < arrayData.length; i++) {
            boolean isPositiveToDiagonal = false;
            for (int j = 0; j <= i; j++) {
                if (arrayData[i][j] > 0) {
                    positivesToDiagonal[i] = arrayData[i][j];
                    isPositiveToDiagonal = true;
                    break;
                }
            }

            if (!isPositiveToDiagonal) {
                positivesToDiagonal[i] = 1;
            }
        }

        return positivesToDiagonal;
    }

    private int getMaxByModuleColumn(){
        int[] moduleColumnSum = new int[arrayData[1].length];

        for (int[] anArrayData : arrayData) {
            for (int j = 0; j < anArrayData.length; j++) {
                moduleColumnSum[j] += Math.abs(anArrayData[j]);
            }
        }

        return getIndexOfMax(moduleColumnSum);
    }
    private int getMin(int[] data) {
        int min = data[0];

        for (int value : data) {
            if (value < min) {
                min = value;
            }
        }

        return min;
    }
    private int getMax(int[] data) {
        int max = data[0];

        for (int value : data) {
            if (value > max) {
                max = value;
            }
        }

        return max;
    }
    private int getIndexOfMax(int[] data) {
        int max = getMax(data);

        for (int i = 0; i < data.length; i++) {
            if (data[i] == max) {
                return i;
            }
        }

        return -1;
    }
}
