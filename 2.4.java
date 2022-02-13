import java.util.Scanner;

class massive24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте число n: ");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 != 0) {
                    System.out.print((array[i][j] = (n - j)) + " ");
                } else {
                    System.out.print((array[i][j] = (j + 1)) + " ");
                }
            }
            System.out.println();
        }
    }
}