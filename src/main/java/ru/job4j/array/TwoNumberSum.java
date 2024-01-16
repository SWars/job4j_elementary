package ru.job4j.array;

public class TwoNumberSum {

    public static int[] getIndexes(int[] array, int target) {
        int[] result = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] == target && i != j) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        if (result[0] > result[1]) {
            int temp = result[0];
            result[0] = result[1];
            result[1] = temp;
            return result;
        } else {
            return new int[0];
        }
    }
}
