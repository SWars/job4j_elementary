package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        boolean result = (ab + bc > ac) && (ab + ac > bc) && (bc + ac > ab) ? true : false;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(exist(2.0, 2.0, 2.0));
    }
}
