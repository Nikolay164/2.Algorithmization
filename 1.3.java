import java.util.Scanner;

class Massive3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        System.out.println("Введите число:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for (int num : array) {
            if (num < 0)
                sum1 += 1;
        }
        for (int num : array) {
            if (num > 0)
                sum2 += 1;
        }
        for (int num : array) {
            if (num == 0)
                sum3 += 1;
        }
        System.out.println("отрицательных элементов в массиве:" + sum1 + ", положительных элементов в массиве:" + sum2 + ", нулевых элементов в массиве:: " + sum3);
    }
}