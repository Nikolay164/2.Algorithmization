import static java.lang.Math.*;

import java.util.Scanner;
import java.util.Arrays;

class Massive48 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве(не менее 4 чисел): ");
        int M = scanner.nextInt();
        System.out.println("Введите от какого номера элемента подсчитать сумму: ");
        int K = scanner.nextInt();

        int[] arrayD = A(M);
        System.out.println("Исходный массив случайных чисел: " + Arrays.toString(arrayD));
        int[] arraySum = anArrayOfAmounts(K, M, arrayD);
        System.out.println("Сумма трех последовательно расположенных элементов с номерами от " + K + " до " + M + ": ");
        for (int i = 0; i < arraySum.length; i++) {
            System.out.println("[" + K + "," + (K + 1) + "," + (K + 2) + "]: " + arraySum[i]);
            K++;
        }
    }


    public static int[] A(int numM) {
        int[] array = new int[numM + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (random() * ((100 + 100) + 1) - 100);
        }
        return array;
    }


    public static int sumOfThreeElements(int numK, int[] array) {
        return array[numK] + array[numK + 1] + array[numK + 2];
    }


    public static int[] anArrayOfAmounts(int numK, int numM, int[] array) {
        int[] arraySum = new int[(numM - numK) - 1];
        int j = 0;
        for (int i = numK; i < numM - 1; i++) {
            arraySum[j] = sumOfThreeElements(i, array);
            j++;
        }
        return arraySum;
    }
}