import java.util.Random;
import java.util.Scanner;

class massive21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = 0;
        System.out.println("Задайте количество строк: ");
        int k = scanner.nextInt();
        System.out.println("Задайте количество столбцов: ");
        int s = scanner.nextInt();
        int[][] a = new int[k][s];
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
        System.out.println("Нечетные столбцы,у которых первый элемент больше последнего:");
        for (int i = 0; i < a.length; i++, System.out.println()) {
            for (int j = 0; j < a[i].length; j++) {
                if (j % 2 == 0 && a[0][j] > a[k - 1][j])
                    System.out.print(a[i][j] + " ");
            }
        }
    }
}


