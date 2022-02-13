import java.io.*;
import java.util.Scanner;

import static java.lang.Math.random;

class Massive28 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте максимальное и минимальное количество строк и столбцов: ");
        int max = scanner.nextInt();
        int min = scanner.nextInt();
        int numStrok = (int) (random() * ((max - min) + 1)) + min;
        int numStolb = (int) (random() * ((max - min) + 1)) + min;
        int[][] matrix = new int[numStrok][numStolb];
        System.out.println("Задайте максимальное и минимальное числа в матрице: ");
        int Maxmatrix = scanner.nextInt();
        int MinMatrix = scanner.nextInt();
        System.out.print("Введите число от 0 до " + (numStolb - 1) + " - номер первого столбца для замены  - ");
        int Perv = scanner.nextInt();
        System.out.print("Введите число от 0 до " + (numStolb - 1) + " - номер второго столбца для замены  - ");
        int Vtor = scanner.nextInt();
        System.out.println("Исходный массив для замены столбцов:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (random() * ((Maxmatrix - MinMatrix) + 1)) + MinMatrix;
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][Perv];
            matrix[i][Perv] = matrix[i][Vtor];
            matrix[i][Vtor] = temp;
        }
        System.out.println("Массив после замены столбцов");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}