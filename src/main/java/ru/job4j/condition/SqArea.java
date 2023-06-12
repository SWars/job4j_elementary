package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = (double) (p / (2 * (k + 1)));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        int p = 6;
        int k = 2;
        double result1 = SqArea.square(p, k);
        System.out.println("When p = " + p + ", k = " + k + " square = " + result1);
    }
}
