package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday", "понедельник", "monday" -> 1;
            case "Вторник", "Tuesday", "вторник", "tuesday" -> 2;
            case "Среда", "Wednesday", "среда", "wednesday" -> 3;
            case "Четрверг", "Thursday", "четверг", "thursday" -> 4;
            case "Пятница", "Friday", "пятница", "friday" -> 5;
            case "Суббота", "Saturday", "суббота", "saturday" -> 6;
            case "Воскресенье", "Sunday", "воскресенье", "sunday" -> 7;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        System.out.println(numberOfDay("monday"));
    }
}
