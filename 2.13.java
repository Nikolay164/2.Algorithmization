import java.util.Random;
import java.util.Scanner;

class massive213 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте количество строк и столбцов: ");
        int str = scanner.nextInt();
        int stolb = scanner.nextInt();
        int[][] a = new int[str][stolb];
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
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a[j].length; k++) {
                    if (a[i][k] < a[j][k]) {
                        int temp = a[j][k];
                        a[j][k] = a[i][k];
                        a[i][k] = temp;
                    }
                }
            }
        }
        System.out.println("Столбцы по возрастанию:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a[j].length; k++) {
                    if (a[i][k] > a[j][k]) {
                        int temp = a[i][k];
                        a[i][k] = a[j][k];
                        a[j][k] = temp;
                    }
                }
            }
        }
        System.out.println("Столбцы по убыванию:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


    }
}