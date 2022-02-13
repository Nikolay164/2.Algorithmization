import static java.lang.Math.*;

import java.util.Scanner;

class Massive416 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();
        if (nech(a(n))) {
            System.out.print("Число " + n + " состоит из нечетных чисел, сумма цифр равна ");
            int sum = summ(a(n));
            System.out.println(sum);
            System.out.println("Количество четных чисел в сумме цифр числа " + n + " равна " + kolv(a(sum)));
        } else {
            System.out.println("Число " + n + "  не содержит только нечетные числа");
        }
    }


    public static int[] a(int num) {
        char[] charArr = Integer.toString(abs(num)).toCharArray();
        int[] array = new int[charArr.length];
        for (int i = 0; i < charArr.length; i++) {
            array[i] = Character.getNumericValue(charArr[i]);
        }
        return array;
    }


    public static boolean nech(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
            } else break;
        }
        if (count == array.length) {
            return true;
        } else {
            return false;
        }
    }


    public static int summ(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }


    public static int kolv(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}