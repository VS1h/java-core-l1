package сycles.lesson5.Task2;

import java.util.Scanner;

public class MirrorNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input digit, please!");
        int value = scanner.nextInt();
        System.out.println(mirrorForDigits(value));
    }

    static int mirrorForDigits(int value) {
        int result = 0;
        while (value > 0) {
            result = result * 10 + (value % 10);
            value /= 10;
        }
        return result;
    }
}