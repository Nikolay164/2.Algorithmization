import java.util.Random;

class Massive4 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int max1 = 0, min1 = 0, swap;
        Random random = new Random();
        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt() % 20;
            System.out.print(array[i] + " ");
            if (array[i] < min) {
                min = array[i];
                min1 = i;
            }
            if (array[i] > max) {
                max = array[i];
                max1 = i;
            }
        }
        System.out.println();
        swap = array[min1];
        array[min1] = array[max1];
        array[max1] = swap;
        System.out.println("Массив после обмена чисел " + max + " и " + min + " :");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}