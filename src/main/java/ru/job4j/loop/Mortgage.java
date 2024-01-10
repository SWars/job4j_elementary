package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        if (salary >= amount * ((percent + 100) / 100)) {
            year = 1;
        } else {
            while (amount > 0) {
                amount *= (percent + 100) / 100;
                amount -= amount;
                year++;
            }
            year++;
        }
        return year;
    }
}
