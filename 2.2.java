import java.util.Random;
import java.util.Scanner;

class massive22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте количество строк и столбцов: ");
        int k = scanner.nextInt();
        int[][] a = new int[k][k];
        Random rnd = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rnd.nextInt(100) + 1;

            }
        }
        for (int i = 0; i < a.length; i++, System.out.println()) {
            for (int j = 0; j < a[i].length; j++) {

                System.out.print(a[i][j] + " ");

            }
        }
        System.out.println("Элементы,стоящие на диагонали:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i][i] + " ");


        }
    }
}

