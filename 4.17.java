import static java.lang.Math.*;

import java.util.Scanner;

class Massive417 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();

        System.out.println("Количество вычитаний из числа " + n + " равно " + kolv(n));
    }


    public static int[] a(int num) {
        char[] charArr = Integer.toString(abs(num)).toCharArray();
        int[] array = new int[charArr.length];
        for (int i = 0; i < charArr.length; i++) {
            array[i] = Character.getNumericValue(charArr[i]);
        }
        return array;
    }


    public static int summ(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }


    public static int kolv(int num) {
        int count = 1;
        while (true) {
            int temp = num - summ(a(num));
            if (temp > 0) {
                num = temp;
                count++;
            } else break;
        }
        return count;
    }
}