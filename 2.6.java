import java.util.Scanner;

class massive26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте число n: ");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length / 2; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j >= i && j < array[i].length - i) {
                    System.out.print((array[i][j] = 1) + " ");
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
        for (int i = array.length / 2; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j <= i && j >= array[i].length - 1 - i) {
                    System.out.print((array[i][j] = 1) + " ");
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}