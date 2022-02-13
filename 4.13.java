import java.util.Scanner;

class Massive413 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int N = scanner.nextInt();
        System.out.println("Пары чисел на отрезке: [" + N + " : " + 2 * N + "]:");
        int[][] matrix = NewA(N);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }


    public static int[] A(int N) {
        int[] array = new int[(2 * N - N) + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = N + i;
        }
        return array;
    }


    public static int[][] NewA(int number) {
        int[][] matrix = new int[2 * number - number - 1][2];
        for (int i = 0; i < A(number).length - 2; i++) {
            matrix[i][0] = A(number)[i];
            matrix[i][1] = A(number)[i + 2];
        }
        return matrix;
    }
}
