import java.util.Random;

class Massive5 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();
        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt() % 20;
            if (array[i] > i)
                System.out.println("Число,которое больше своего индекса: " + array[i]);
        }
    }
}
