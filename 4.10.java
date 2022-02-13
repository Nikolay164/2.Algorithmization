import java.util.Arrays;
import java.util.Scanner;

class Massive410 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число,которое разбить для формирования массива: ");
        int A = scanner.nextInt();
        System.out.println("Массив из числа N = " + A + ": " + Arrays.toString(N(A)));
    }

    public static int[] N(int A) {
        char[] ch = Integer.toString(A).toCharArray();
        int[] array = new int[ch.length];
        for (int i = 0; i < ch.length; i++) {
            array[i] = Character.getNumericValue(ch[i]);
        }
        return array;
    }
}