package arrays.lesson6.task2;

/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 * <p>
 * Далее определить среднее арифметическое всех элементов целочисленного
 * массива и вывести на консоль только те элементы, которые больше этого среднего арифметического.
 */

public class ArrTask2 {
    public static void main(String[] args) {

        char[] inputArrayOfChars = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};
        int[] arrayNew = new int[inputArrayOfChars.length];
        double result = (isArithmeticMeanOfArray(inputArrayOfChars, arrayNew));
        System.out.print("Elements of the array > "+result+" : ");
        printElementsOFArr(arrayNew,result);
    }

    private static double isArithmeticMeanOfArray(char[] array, int[] arrayNew) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            arrayNew[i] = array[i];
            sum += arrayNew[i];
        }
        return sum / array.length;
    }

    public static void printElementsOFArr(int[] array, double value) {
        for (int i : array) {
            if (i > value) {
                System.out.print(i + ", ");
            }
        }
    }
}





