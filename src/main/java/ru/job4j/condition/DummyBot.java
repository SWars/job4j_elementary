package ru.job4j.condition;

public class DummyBot {
    public static String answer(String questions) {
        String result = "I don't know. Please, ask another question.";
        if ("Hi, Bot.".equals(questions)) {
            result = "Hi, SmartAss.";
        } else if ("Bye.".equals(questions)) {
           result = "See you later.";
        }
        return result;
    }

    public static void main(String[] args) {
        String result = answer("Hi, Bot.");
        System.out.println(result);
        result = answer("Bye.");
        System.out.println(result);
        result = answer("Ok");
        System.out.println(result);
    }
}
