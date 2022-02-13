import java.util.Random;
import java.util.Scanner;

class Massive7 {

    public static void main(String[] args) {

        int x, y;
        int max;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество чисел в массиве: ");
        int K = scanner.nextInt();

        int[] array = new int[K];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt() % 20;
            System.out.print(array[i] + " ");
        }

        x = 0;
        y = array.length - 1;
        max = Integer.MIN_VALUE;
        for (; x < y; x++) {
            max = Integer.max(array[x] + array[x + 1], max);
        }
        System.out.println();
        System.out.println(max);
    }
}