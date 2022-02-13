import java.util.Scanner;
import java.util.Random;

class Massive29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте количество строк и столбцов: ");
        int Strok = scanner.nextInt();
        int Stolb = scanner.nextInt();
        Random rnd = new Random();
        int[] sum = new int[Stolb];
        int maxSumm = 0;
        int index = 0;
        int[][] a = new int[Strok][Stolb];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rnd.nextInt(100) + 1;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sum[i] += a[j][i];
            }
            if (sum[i] > maxSumm) {
                maxSumm = sum[i];
                index = i;
            }
            System.out.println("Сумма " + i + " столбца равна= " + sum[i]);
        }
        System.out.println("Столбец " + index + " содержит максимальную сумму чисел= " + sum[index]);
    }
}
