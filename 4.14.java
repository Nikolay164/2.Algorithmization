import static java.lang.Math.*;

import java.util.Scanner;

class Massive414 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите до какого числа осуществлять поиск: ");
        int K = scanner.nextInt();

        System.out.print("Список чисел исходя из поиска: ");
        for (int i = 1; i < K; i++) {
            if (SUMM(A(i)) == i) {
                System.out.print(i + ", ");
            }
        }
    }


    public static int[] A(int num) {
        char[] charArr = Integer.toString(num).toCharArray();
        int[] array = new int[charArr.length];
        for (int i = 0; i < charArr.length; i++) {
            array[i] = Character.getNumericValue(charArr[i]);
        }
        return array;
    }


    public static int SUMM(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + (int) pow(array[i], array.length);
        }
        return sum;
    }
}