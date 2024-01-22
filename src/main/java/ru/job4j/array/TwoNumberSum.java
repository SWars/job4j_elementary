package ru.job4j.array;

public class TwoNumberSum {

    public static int[] getIndexes(int[] array, int target) {
        int[] result = new int[2];
        int i = 0;
        int j = array.length - 1;
        while (i < array.length) {
            if (array[i] + array[j] == target && i != j) {
                result[0] = i;
                result[1] = j;
                break;
            } else if (array[i] + array[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return result[0] < result[1] ? result : new int[0];
    }
}
