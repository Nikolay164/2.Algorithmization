import java.util.Scanner;

import static java.lang.Math.*;

class Massive42 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 4 натуральных числа: ");
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int numC = scanner.nextInt();
        int numD = scanner.nextInt();
        System.out.println("Наибольший общий делитель чисел " + numA + ", " + numB + ", " + numC + ", " + numD + " равно " + NOD(numA, numB, numC, numD));
    }


    public static int NOD(int numA, int numB, int numC, int numD) {
        int result = 1;
        int min = min(min(numA, numB), min(numC, numD));
        for (int i = min; i > 0; i--) {
            if (numA % i == 0 && numB % i == 0 && numC % i == 0 && numD % i == 0) {
                result = i;
                break;
            }
        }
        return result;
    }
}