import java.util.Random;
import java.util.Scanner;

class massive23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        System.out.println("Какую строку вывести? ");
        int p = scanner.nextInt();
        System.out.println("Какой столбец вывести? ");
        int o = scanner.nextInt();
        System.out.println("Вывод данных столбца и строки: ");
        p = p - 1;
        o = o - 1;
        for (int i = 0; i < a.length; i++, System.out.println()) {
            for (int j = 0; j < a[i].length; j++) {
                if (j == o && p == i)
                    System.out.print(a[i][j]);
            }
        }
    }
}