import static java.lang.Math.*;

import java.util.Scanner;

class Massive44 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество точек:: ");
        int A = scanner.nextInt();
        int min = -100;
        int max = 100;
        int[][] array = new int[A][2];
        System.out.println("Матрица координат точек: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (random() * ((max - min) + 1) + min);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int[] point = maxDistanceBetweenPoints(array);
        System.out.println("Наибольшее расстояние между точками №" + point[0] + "(" + array[point[0]][0] +
                "," + array[point[0]][1] + ") и №" + point[1] + "(" + array[point[1]][0] +
                "," + array[point[1]][1] + ")");
    }

    public static int[] maxDistanceBetweenPoints(int[][] matrix) {
        double maxDistance = Double.MIN_VALUE;
        int idFirstPoint = 0;
        int idSecondPoint = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                int distanceX = matrix[i][0] - matrix[j][0];
                int distanceY = matrix[i][1] - matrix[j][1];
                double distance = sqrt(pow(distanceX, 2) + pow(distanceY, 2));
                if (distance > maxDistance) {
                    maxDistance = distance;
                    idFirstPoint = i;
                    idSecondPoint = j;
                }
            }
        }
        return new int[]{idFirstPoint, idSecondPoint};
    }
}