package ru.job4j.array;

public class TwoNumberSum {

    public static int[] getIndexes(int[] array, int target) {
        int[] result = new int[2];
        int i = 0;
        int j = 0;
        while (i < array.length) {
            if (array[i] + array[j] == target && i != j) {
                result[0] = i <= j ? i : j;
                result[1] = i >= j ? i : j;
                break;
            } else if (j < array.length - 1) {
                j++;
            } else {
                i++;
                j = 0;
            }
        }
        return result[0] < result[1] ? result : new int[0];
    }
}
