import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

class Massive36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте диапазон чисел в массиве: ");
        int minNum = scanner.nextInt();
        int maxNum = scanner.nextInt();
        System.out.println("Задайте количество массива: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (random() * ((maxNum - minNum) + 1) + minNum);
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));
        for (int step = array.length / 2; step > 0; step /= 2) {
            for (int i = step; i < array.length; i++) {
                for (int j = i - step; j >= 0 && array[j] > array[j + step]; j -= step) {
                    int temp = array[j];
                    array[j] = array[j + step];
                    array[j + step] = temp;
                }
            }
        }

        System.out.println("Отсортированный массив методом Шелла: " + Arrays.toString(array));
    }
}