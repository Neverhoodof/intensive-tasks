package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    public static void main(String[] args) {

        int floorAmount = 5;
        int entranceAmount = 4;
        int flatNumber = 20;

        System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        String textMessage = flatNumber + " кв - ";

        if (flatNumber < 1 || flatNumber > floorAmount * entranceAmount * 4) {
            textMessage = "Такой квартиры не существует!";
            return textMessage;
        }

        int flatEntrance = (flatNumber + floorAmount * 4 - 1) / (floorAmount * 4);
        int flatFloor = (flatNumber + 3) / 4 - ((flatEntrance - 1) * floorAmount);
        int flatCorner = flatNumber % 4;

        textMessage = textMessage + flatEntrance + " подъезд, " + flatFloor + " этаж, ";

        switch (flatCorner) {
            case (1) -> textMessage = textMessage + "слева от лифта, влево";
            case (2) -> textMessage = textMessage + "слева от лифта, вправо";
            case (3) -> textMessage = textMessage + "справа от лифта, влево";
            case (0) -> textMessage = textMessage + "справа от лифта, вправо";
        }

        return textMessage;
    }
}