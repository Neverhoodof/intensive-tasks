package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 0;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        String textMessage = "Вам " + age;

        if (age <= 0) {
            textMessage = "Вам нет и годика!";
        } else if (age % 100 > 10 && age % 100 < 15) {
            textMessage = textMessage + " лет";
        } else if (age % 10 > 1 && age % 10 < 5) {
            textMessage = textMessage + " года";
        } else if (age % 10 == 1) {
            textMessage = textMessage + " год";
        } else textMessage = textMessage + " лет";

        return textMessage;
    }
}