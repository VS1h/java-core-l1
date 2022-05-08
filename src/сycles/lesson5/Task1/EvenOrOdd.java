package сycles.lesson5.Task1;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input digit, please!");
        int value = scanner.nextInt();
        System.out.println("\ncounter evev digits: " + counterForEvenDigits(value));
        counterForOddDigits(value);
    }

    static int counterForEvenDigits(int value) {

        int digit = 0;
        int result = 0;
        while (value > 0) {
            digit = value % 10;
            if (digit % 2 == 0 ) {
                result += 1;
                System.out.print(digit + ", ");
            }
            value /= 10;
        }
        return result;
    }

    static void counterForOddDigits(int value) {

        int digit = 0;
        int result = 0;
        while (value > 0) {
            digit = value % 10;
            if (digit % 2 != 0) {
                result += 1;
                System.out.print(digit + ", ");
            }
            value /= 10;
        }
        System.out.println("\ncounter odd digits: " + result);
    }

}
