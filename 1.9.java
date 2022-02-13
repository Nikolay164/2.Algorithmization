import java.util.Random;
import java.util.Scanner;

class Massive9 {

    public static void main(String[] args) {

        int x, y, z;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество чисел в массиве: ");
        int K = scanner.nextInt();

        int[] array = new int[K];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt() % 20;
            System.out.print(array[i] + " ");
        }


        z = x = 1;
        y = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length; j++) {
                if (i == j) continue;
                if (array[i] == array[j]) {
                    x++;
                }
            }
            if (x > z) {
                y = array[i];
                z = x;
            } else if (x == z) {
                if (array[i] < y) {
                    y = array[i];
                }
            }
            x = 1;
        }
        System.out.println();
        System.out.println("Наиболее часто встречающееся наименьшее число: " + y);
        System.out.println("Оно встречается: " + z + "раз(а)");
    }
}