import java.util.Arrays;

import static java.lang.Math.random;

class Massive31 {
    public static void main(String[] args) {
        int k = 5;
        int minNum = 0;
        int maxNum = 100;
        int lengthA = 10;
        int lengthB = 5;
        int[] arrayA = new int[lengthA + lengthB];
        int[] arrayB = new int[lengthB];
        for (int i = 0; i < lengthA; i++) {
            arrayA[i] = (int) (random() * ((maxNum - minNum) + 1) + minNum);
        }
        System.out.println("Массив A: " + Arrays.toString(arrayA));
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = (int) (random() * ((maxNum - minNum) + 1) + minNum);
        }
        System.out.println("Массив B: " + Arrays.toString(arrayB));
        System.arraycopy(arrayA, k, arrayA, lengthA, lengthA - k);
        System.arraycopy(arrayB, 0, arrayA, k + 1, lengthB);
        System.out.println("Новый массив: " + Arrays.toString(arrayA));
    }
}