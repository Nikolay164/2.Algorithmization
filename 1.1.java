import java.util.Scanner;

class Massive1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число K:");
        int K = scanner.nextInt();
        int[] array = new int[5];
        int sum = 0;
        System.out.println("Введите последовательность 5 чисел:");
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }

        for (int num : array) {
            if (num % K == 0)
                sum = sum + num;
        }
        System.out.println("Сумма элементов массива равна: " + sum);
    }
}