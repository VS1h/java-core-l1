package functions.lesson4.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first digit");
        double oneValue = scanner.nextDouble();
        System.out.println("Input second digit");
        double twoValue = scanner.nextDouble();
        System.out.println("Input action for digits");
        char action = scanner.next().charAt(0);

        System.out.println(SimpleCalcut(oneValue, twoValue, action));
    }

    public static double SimpleCalcut(double oneDigit, double twoDigit, char action) {
        double result = 0;
        if (action == '+') {
             result = oneDigit + twoDigit;
        } else if (action == '-') {
             result = oneDigit - twoDigit;
        } else if (action == '*') {
             result = oneDigit * twoDigit;
        } else if (action == '/' && twoDigit != 0) {
             result = oneDigit / twoDigit;
        } else if (action == '%') {
             result = oneDigit % twoDigit;
        } 
        return result;
    }

}