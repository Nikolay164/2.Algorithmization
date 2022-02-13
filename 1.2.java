import java.util.Scanner;

class Massive2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число Z:");
        int n = scanner.nextInt();
        int[] array = new int[5];
        int sum = -1;
        System.out.println("Введите последовательность 5 чисел:");
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }

        for (int num : array) {
            if (num < n)
                sum = sum + 1;
        }
        System.out.println("Сумма элементов массива равна: " + sum);
    }
}