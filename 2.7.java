import java.util.Scanner;

import static java.lang.Math.*;

class Massive27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте число n: ");
        int n = scanner.nextInt();
        int s = 0;
        double[][] array = new double[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print((array[i][j] = sin((pow(i, 2) - pow(j, 2)) / n)) + " ");

                if (array[i][j] > 0) {
                    s++;
                }
            }
            System.out.println();
        }
        System.out.println("Количество положительных элементов матрицы= " + s);
    }
}