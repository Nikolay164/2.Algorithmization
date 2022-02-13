import java.util.Scanner;

class Massive41 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два натуральных числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("НОД чисел " + a + " и " + b + " равен " + NOD(a, b));
        System.out.println("НОК чисел " + a + " и " + b + " равно " + NOK(a, b));
    }


    public static int NOD(int a, int b) {
        int result = 1;
        int min = a > b ? b : a;
        for (int i = min; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                result = i;
                break;
            }
        }
        return result;
    }


    public static int NOK(int a, int b) {
        int result = 1;
        int max = a > b ? a : b;
        for (int i = max; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                result = i;
                break;
            }
        }
        return result;
    }
}