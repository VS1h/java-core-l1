package functions.lesson4.Task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value for 1st triangle");
        int oneValue = scanner.nextInt();
        System.out.println("Input value2 for 1st triangle");
        int twoValue = scanner.nextInt();
        System.out.println("Input value for 2nd triangle");
        int oneDigit = scanner.nextInt();
        System.out.println("Input value2 for 2nd triangle");
        int twoDigit = scanner.nextInt();

        double Area1 = areaTriangle(oneValue, twoValue);
        double Area2 = areaTriangle(oneDigit, twoDigit);
        areaCompare(Area1, Area2);
    }

    static double areaTriangle(int a, int b) {
        return a * b / 2;

    }

    static void areaCompare(double oneArea, double twoArea) {
        if (oneArea > twoArea) {
            System.out.println("1st triagle more than 2nd");
        } else if (oneArea < twoArea) {
            System.out.println("2nd triagle more than 1st");
        } else if (oneArea == twoArea) {
            System.out.println("triangls equal");
        }
    }
}

