package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Task3 {
    public static void main(String[] args) {

        int year = 1636;

        if (isLeap(year)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - год невисокосный");
        }
    }

    static boolean isLeap(int year) {

        if (year % 400 == 0) {
            return true;
        }

        return year % 4 == 0 && year % 100 != 0;
    }
}