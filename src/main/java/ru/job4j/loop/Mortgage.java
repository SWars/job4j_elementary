package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        if (salary >= amount * ((percent + 100) / 100)) {
            year = 1;
        } else {
            while (salary < amount * ((percent + 100) / 100)) {
                amount = amount * ((percent + 100) / 100);
                amount = amount - salary;
                year++;
            }
            year++;
        }
        return year;
    }
}
