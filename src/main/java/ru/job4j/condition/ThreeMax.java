package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        result = second > first ? second : first;
        result = third > result ? third : result;
        return result;
    }
}
