package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float rubles = 140;
        float euro = Converter.rubleToEuro(rubles);
        float dollars = Converter.rubleToDollar(rubles);
        System.out.printf(rubles + " rubles are " + String.format("%.2f", euro) + " euro or " + String.format("%.2f", dollars) + " dollars.");
    }
}
