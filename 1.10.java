import java.util.Random;
import java.util.Scanner;


class Massive10 {

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
            if (i == 1) System.out.print("0 ");
            else if (i % 2 == 1 && i > 1)
                System.out.print("0 ");
            else System.out.print(array[i] + " ");

        }

    }
}