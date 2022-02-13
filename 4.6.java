import java.util.Scanner;

import static java.lang.Math.*;

class Massive46 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа: ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        Vsaimno(A, B, C);
    }

    public static void Vsaimno(int A, int B, int C) {
        int min = min(min(abs(A), abs(B)), abs(C));
        System.out.print("Числа " + A + ", " + B + " и " + C);
        int count = 0;
        for (int i = min; i > 1; i--) {
            if (A % i == 0 && B % i == 0 && C % i == 0) {
                System.out.println(" не являются взаимно простыми,НОД равен " + i);
                break;
            } else {
                count++;
            }
            if (count == min - 1) {
                System.out.println(" числа являются взаимно простыми");
            }
        }
        if (abs(A) == 1 || abs(B) == 1 || abs(C) == 1) {
            if (A == 0 || B == 0 || C == 0) {
                System.out.println(" являются не взаимно простыми, т.к. одно из чисел равно 0");
            } else {
                System.out.println(" являются взаимно простыми, т.к. одно из чисел равно 1 или -1");
            }
        }
    }


}