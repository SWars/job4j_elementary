package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (double) a + b + c;
        double rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return rsl;
    }

    public static void main(String[] args) {
        double a = 2;
        double b = 2;
        double c = 2;
        double rsl = TrgArea.area(a, b, c);
        System.out.println("area (" + a + ", " + b + ", " + c + ") = " + String.format("%.5f", rsl));
    }
}