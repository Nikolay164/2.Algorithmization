import java.util.Random;
import java.util.Scanner;

class Massive6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве: ");
        int K = scanner.nextInt();
        int Sum = 0;
        int[] array = new int[K];
        Random random = new Random();
        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt() % 20;
            System.out.print(array[i] + " ");
            for (int j = 2; j <= i; j++) {

                if (j < i & i % j == 0) {
                    break;
                }
                if (i % j == 0) {
                    Sum += array[i];

                }
            }
        }
        System.out.println();
        System.out.println("Сумма чисел,порядковые номера которых являются простыми числами: " + Sum);
    }
}
