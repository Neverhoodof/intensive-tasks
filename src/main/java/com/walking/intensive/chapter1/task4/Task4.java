package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {

        double a = 2;
        double b = -5;
        double c = 2;

        System.out.println(solveQuadraticEquation(a, b, c));
    }

    static String solveQuadraticEquation(double a, double b, double c) {
        String textMessage = "Количество решений: ";
        double discriminantValue = b * b - 4 * a * c;

        if (a == 0 && b == 0 && c == 0) {
            return "Бесконечное количество решений";
        } else if (a == 0 && b == 0 && c != 0) {
            return "Решений нет";
        } else if (a == 0 && b != 0) {
            return "x = -c/b";
        }

        if (discriminantValue > 0) {
            double firstValue = (-b - Math.sqrt(discriminantValue)) / (2 * a);
            double secondValue = (-b + Math.sqrt(discriminantValue)) / (2 * a);
            textMessage = textMessage + "2. Корни: " + firstValue + "; " + secondValue;
        } else if (discriminantValue == 0) {
            double firstValue = (-b - Math.sqrt(discriminantValue)) / (2 * a);
            textMessage = textMessage + "1. Корень: " + firstValue;
        } else {
            textMessage = textMessage + "0.";
        }

        return textMessage;
    }
}