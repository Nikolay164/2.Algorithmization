import static java.lang.Math.random;

import java.util.Scanner;

class Massive214 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте число строк: ");
        int str = scanner.nextInt();
        System.out.println("Задайте число столбцов: ");
        int stolb = scanner.nextInt();
        int[][] matrix = str >= stolb - 1 ? new int[str][stolb] : new int[stolb][str];
        int[] count = str >= stolb - 1 ? new int[stolb] : new int[str];
        int One = 0;
        for (int i = 0; i < count.length; i++) {
            count[i] = i;
        }

        for (int i = 0; i < count.length; i++) {
            while (true) {
                if (One == count[i]) break;
                int j = (int) (random() * (matrix.length));
                if (matrix[j][i] == 0) {
                    matrix[j][i] = 1;
                    One++;
                }
            }
            One = 0;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}