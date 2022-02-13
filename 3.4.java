import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

class Massive34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте диапазон чисел в массиве: ");
        int minNum = scanner.nextInt();
        int maxNum = scanner.nextInt();
        System.out.println("Задайте количество массива: ");
        int n = scanner.nextInt();
        int count = 0;
        boolean sorted = true;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (random() * ((maxNum - minNum) + 1) + minNum);
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));
        while (sorted) {
            sorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = true;
                    count++;
                }
            }
        }
        System.out.println("Отсортированный массив методом сортировки обмена: " + Arrays.toString(array));
        System.out.println("Количесвто перестановок: " + count);
    }
}