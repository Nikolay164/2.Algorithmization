import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

class Massive33 {

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
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        System.out.println("Отсортированный массив методом сортировки выбора: " + Arrays.toString(array));
    }
}