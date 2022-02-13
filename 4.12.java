import java.util.Arrays;
import java.util.Scanner;

class Massive412 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа K и N: ");
        int K = scanner.nextInt();
        int N = scanner.nextInt();

        int[] array = NewA(N, K);
        System.out.println("При K = " + K + " и N = " + N + ", массив чисел будет выглядеть так: " + Arrays.toString(array));
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
            sum = sum + array[i];
        }
        return sum;
    }


    public static int DLINA(int numN, int numK) {
        int length = 0;
        for (int i = 0; i <= numN; i++) {
            if (SUMM(A(i)) == numK) {
                length++;
            }
        }
        return length;
    }


    public static int[] NewA(int numN, int numK) {
        int[] array = new int[DLINA(numN, numK)];
        int j = 0;
        for (int i = 0; i <= numN; i++) {
            if (SUMM(A(i)) == numK) {
                array[j] = i;
                j++;
            }
        }
        return array;
    }
}