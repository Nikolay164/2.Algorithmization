import java.util.Random;
import java.util.Scanner;


class Massive8 {

    public static void main(String[] args) {
        int[] array2;
        int min;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество чисел в массиве: ");
        int K = scanner.nextInt();

        int[] array = new int[K];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt() % 20;
            System.out.print(array[i] + " ");
        }
        min = Integer.MAX_VALUE;
        int x = 0;
        for (int element : array) {
            if (element < min) {
                min = element;
                x = 1;
            } else if (element == min) {
                x++;
            }
        }

        array2 = new int[array.length - x];
        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if (array[i] != min) {
                array2[j] = array[i];
            } else {
                j--;
            }
        }

        System.out.println(" Значение минимального элемента: " + min);

        System.out.println("Новая последовательность:");
        for (int element : array2) {
            System.out.print(element + " ");
        }
    }
}