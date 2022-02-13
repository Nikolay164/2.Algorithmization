import java.util.Arrays;
import java.util.Random;


class Massive32 {

    public static void main(String[] args) {
        int lengthA = 15;
        int lengthB = 5;
        int[] mass3;
        int count;
        count = 0;
        Random rnd = new Random();
        int[] arrayA = new int[lengthA + lengthB];
        int[] arrayB = new int[lengthB];
        for (int i = 0; i < lengthA; i++) {
            arrayA[i] = rnd.nextInt(100) + 1;
            Arrays.sort(arrayA);

        }
        System.out.println(Arrays.toString(arrayA));
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = rnd.nextInt(100) + 1;
            Arrays.sort(arrayB);
        }
        System.out.println(Arrays.toString(arrayB));
        mass3 = new int[arrayA.length + arrayB.length];
        for (int i = 0; i < arrayA.length; i++) {
            mass3[i] = arrayA[i];
            count++;
        }
        for (int j = 0; j < arrayB.length; j++) {
            mass3[count++] = arrayB[j];
        }
        for (int i = 0; i < mass3.length; i++) {
        }
        for (int i = mass3.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (mass3[i] < mass3[j])
                    mass3[i] = mass3[i] + mass3[j] - (mass3[j] = mass3[i]);
            }
        }
        System.out.println("Новая последовательность неубывающих чисел из тех двух массивов:");
        for (int i = 0; i < mass3.length; i++) {
            System.out.print(mass3[i] + " ");
        }
    }
}