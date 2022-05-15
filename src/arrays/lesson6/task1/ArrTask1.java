package arrays.lesson6.task1;

/**Задание 1
 Дан одномерный массив целых чисел.
 Написать функцию, удаляющую из него все отрицательные элементы
 (удалить - значит создать новый массив с только положительными элементами).
 После удаления - умножить каждый элемент массива на его длину.
 Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
*/

 public class ArrTask1 {
    public static void main(String[] args) {
        int[] inputArrayOfDigits = {3, 5, -6, 3, 2, -9, 0, -123};
        printArr(inputArrayOfDigits);
    }

    private static void printArr(int[] inputArrayOfDigits) {
        int positive = countPositiveDigits(inputArrayOfDigits);
        int[] arrayOnlyPositiveDigits = new int[positive];
        int count = 0;
        for (int i = 0; i < inputArrayOfDigits.length; i++) {
            if (inputArrayOfDigits[i] >= 0) {
                arrayOnlyPositiveDigits[count] = inputArrayOfDigits[i];
                arrayOnlyPositiveDigits[count]*=positive;
                count++;
            }
        }
        for (int i = 0; i < arrayOnlyPositiveDigits.length; i++) {
            System.out.print(arrayOnlyPositiveDigits[i] + " ");
        }
    }

    public static int countPositiveDigits(int[] inputArrayOfDigits) {
        int digitsPositiveDigits= 0;
        for (int i = 0; i < inputArrayOfDigits.length; i++) {
            if (inputArrayOfDigits[i] >= 0) {
                digitsPositiveDigits++;
            }
        }
        return digitsPositiveDigits;
    }
}
