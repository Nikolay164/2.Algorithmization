import static java.lang.Math.random;

import java.util.Scanner;

class Massive215 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте число строк: ");
        int str = scanner.nextInt();
        System.out.println("Задайте число столбцов: ");
        int stolb = scanner.nextInt();
        System.out.println("Задайте диапазон чисел в матрице: ");
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        int numMax = Integer.MIN_VALUE;
        int[][] a = new int[str][stolb];
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (random() * ((max - min) + 1) + min);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > numMax) {
                    numMax = a[i][j];
                }
            }
        }
        System.out.println("Наибольший элемент: " + numMax);
        System.out.println("Новая матрица имеет следующий вид:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] % 2 == 1) {
                    a[i][j] = numMax;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}