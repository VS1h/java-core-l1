package arrays.lesson6.task3;

import static java.lang.System.out;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, которая принимает этот массив и разбивает на 3 других:
 * с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 */
public class ArrTask3 {
    public static void main(String[] args) {
        int[] inputArray = {-4, 0, 1, 9, 0, -18, 3};
        int[] arrNegative = new int[countDigitsOfArray(inputArray, '-')];
        int[] arrPositive = new int[countDigitsOfArray(inputArray, '+')];
        int[] arrZero = new int[countDigitsOfArray(inputArray, '0')];
        printNewArray(inputArray, arrNegative, arrPositive, arrZero);
    }
    private static void printNewArray(int[] inputArray, int[] arrNegative, int[] arrPositive, int[] arrZero) {
        for (int[] ints : createNewArray(inputArray, arrNegative, arrPositive, arrZero)) {
            for (int anInt : ints) {
                out.print(anInt + " ");
            }
            out.println();
        }
    }
    public static int countDigitsOfArray(int[] array, char choosePlusOrMinusOrZero) {
        int countDigitsNegative = 0;
        int countDigitsPositive = 0;
        int countdigitsZero = 0;
        if (choosePlusOrMinusOrZero == '-') {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    countDigitsNegative++;
                }
            }
            return countDigitsNegative;
        } else if (choosePlusOrMinusOrZero == '+') {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0) {
                    countDigitsPositive++;
                }
            }
            return countDigitsPositive;
        } else if (choosePlusOrMinusOrZero == '0') {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    countdigitsZero++;
                }
            }
            return countdigitsZero;
        }
        return 0;
    }

    public static int [][] createNewArray(int[] inputArray, int[] arrayNegat, int[] arrayPosit, int[] arrayZero) {
        int countNegat = 0;
        int countPosit = 0;
        int countZero = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < 0) {
                arrayNegat[countNegat] = inputArray[i];
                countNegat++;
            } else if (inputArray[i] > 0) {
                arrayPosit[countPosit] = inputArray[i];
                countPosit++;
            } else if (inputArray[i] > 0) {
                arrayZero[countZero] = inputArray[i];
                countZero++;
            }
        }return addDigitsOnTwoRangeArray(arrayNegat,arrayPosit,arrayZero);
        }

    public static int[][] addDigitsOnTwoRangeArray(int[] arrayNegative, int[] arrayPositive, int[] arrayZero) {
        int[][] arrayNewFinish = new int[3][];
        for (int i = 0; i < arrayNewFinish.length; i++) {
            if (i == 0) {
                arrayNewFinish[i] = new int[arrayNegative.length];
                for (int j = 0; j < arrayNegative.length; j++) {
                    arrayNewFinish[i][j] = arrayNegative[j];
                }
            } else if (i == 1) {
                arrayNewFinish[i] = new int[arrayPositive.length];
                for (int j = 0; j < arrayPositive.length; j++) {
                    arrayNewFinish[i][j] = arrayPositive[j];
                }
            } else if (i == 2) {
                arrayNewFinish[i] = new int[arrayZero.length];
                for (int j = 0; j < arrayZero.length; j++) {
                    arrayNewFinish[i][j] = arrayZero[j];
                }
            }
        }return arrayNewFinish;
    }
}

