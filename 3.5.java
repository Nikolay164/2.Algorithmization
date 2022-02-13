import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

class Massive35 {

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
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (current < array[j]) {
                    array[j + 1] = array[j];
                } else break;
            }
            array[j + 1] = current;
        }
        System.out.println("Отсортированный массив методом сортировки вставками: " + Arrays.toString(array));
    }
}