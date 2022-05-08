package functions.lesson4.Task1;

public class Task1 {
    public static void main(String[] args) {
        int minutes = 2;
        WhatQuaterHour(minutes);

    }

    static void WhatQuaterHour(int min) {
        if (min >= 0 && min <= 15) {
            System.out.println("First quater");
        } else if (min > 15 && min <= 30) {
            System.out.println("Second quater");
        } else if (min > 30 && min <= 45) {
            System.out.println("Third quater");
        } else if (min > 30 && min <= 59) {
            System.out.println("Fourth quater");
        } else {
            System.out.println("Error. You're trying again");
        }
    }
}
