import java.util.Scanner;

import static java.lang.Math.*;

class Massive37 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте диапазон чисел в массиве: ");
        int minNum = scanner.nextInt();
        int maxNum = scanner.nextInt();
        System.out.println("Задайте количество чисел в массиве а и b соответственно: ");
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        int[] arrayA = new int[n];
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = (int) (random() * ((maxNum - minNum) + 1) + minNum);
        }
        for (int i = 0; i < arrayA.length; i++) {
            int current = arrayA[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (current < arrayA[j]) {
                    arrayA[j + 1] = arrayA[j];
                } else break;
            }
            arrayA[j + 1] = current;
        }
        int[] arrayB = new int[l];
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = (int) (random() * ((maxNum - minNum) + 1) + minNum);
        }
        for (int i = 0; i < arrayB.length; i++) {
            int current = arrayB[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (current < arrayB[j]) {
                    arrayB[j + 1] = arrayB[j];
                } else break;
            }
            arrayB[j + 1] = current;
        }


        int[] newArray = arrayA;

        System.out.println("Даны последовательность A:");
        printArray(arrayA);
        System.out.println();
        System.out.println("и последовательность B:");
        printArray(arrayB);

        for (int element : arrayB) {
            int pointInsert = nextInsert(newArray, element);
            int[] arrayTemp = new int[newArray.length + 1];
            for (int i = 0; i < newArray.length; i++) {
                if (pointInsert > i) {
                    arrayTemp[i] = newArray[i];
                } else if (pointInsert == i) {
                    arrayTemp[i] = element;
                    arrayTemp[i + 1] = newArray[i];
                } else {
                    arrayTemp[i + 1] = newArray[i];
                }
            }
            newArray = arrayTemp;
            System.out.printf("%n%nПозиция вставки нового элемента \"%d\": i = %d", element, pointInsert);
            System.out.println("\nНовая последовательность:");
            printArray(newArray);
        }
    }

    private static int nextInsert(int[] array, int element) {
        int j = 0;
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex <= lastIndex) {
            j = (firstIndex + lastIndex) / 2;
            if (array[j] == element) {
                return j;
            } else if (array[j] < element) {
                firstIndex = j + 1;
            } else if (array[j] > element && j != 0 && !(array[j - 1] < element)) {
                lastIndex = j - 1;
            } else {
                break;
            }
        }
        return j;
    }

    private static void printArray(int[] a) {
        for (int element : a) {
            System.out.printf("%d ", element);
        }
    }
}