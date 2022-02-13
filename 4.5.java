import static java.lang.Math.*;

import java.util.Arrays;
import java.util.Scanner;

class Massive45 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве: ");
        int A = scanner.nextInt();
        int min = 0;
        int max = 100;
        int[] array = new int[A];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (random() * ((max - min) + 1) + min);
        }
        System.out.println("Массив чисел: " + Arrays.toString(array));
        System.out.println("Второе по величине число из массива - " + Max(array));
    }

    public static int Max(int[] array) {
        int max = Integer.MIN_VALUE;
        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > Max && array[i] != max) {
                Max = array[i];
            }
        }
        return Max;
    }
}