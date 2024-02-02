package ru.job4j.condition;

public class Max {

    public int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public int max(int first, int second, int third, int fourth) {
        return max(max(first, second), max(third, fourth));
    }

    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int result = max(5, 6);
        System.out.println("max(2): " + result);
        Max maxRes = new Max();
        result = maxRes.max(5, 6, 7);
        System.out.println("max(3): " + result);
        result = maxRes.max(5, 7, 6, 9);
        System.out.println("max(4): " + result);
    }
}
