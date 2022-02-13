import java.util.Scanner;

import static java.lang.Math.random;

class massive210 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте количество строк и столбцов: ");
        int k = scanner.nextInt();
        int[][] a = new int[k][k];
        int numMax = 100;
        int numMin = -100;
        System.out.println("Исходный массив для замены столбцов:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (random() * ((numMax - numMin) + 1)) + numMin;
                System.out.print(" " + a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Элементы,стоящие на диагонали:");
        for (int i = 0; i < a.length; i++) {
            if (a[i][i] > 0) {
                System.out.print(a[i][i] + " ");
            }


        }
    }
}

