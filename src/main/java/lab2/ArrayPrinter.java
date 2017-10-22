package lab2;

public class ArrayPrinter {
    public String printArray(int[][] arrayData) {
        String result = "";

        for (int[] anArrayData : arrayData) {
            for (int anAnArrayData : anArrayData) {
                result += anAnArrayData + "\t";
            }
            result += "\n";
        }

        return  result;
    }
    public String printArray(int[] arrayData) {
        String result = "";

        for (int value : arrayData) {
            result += value + "\t";
        }

        result += "\n";
        return  result;
    }
}
