package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива равен: " + ages.length);
        String[] surname = new String[100500];
        System.out.println("Размер массива равен: " + surname.length);
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Роман Алешкин";
        names[1] = "Семён Князев";
        names[2] = "Тимур Головня";
        names[3] = "Антон Легалов";
        for (int i = 0; i <= 3; i++) {
            System.out.println(names[i]);
        }
    }
}
