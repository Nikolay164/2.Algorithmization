import static java.lang.Math.*;

import java.util.Scanner;

class Massive43 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину стороны: ");
        int A = scanner.nextInt();
        System.out.print("Площадь правильного шестиугольника: ");
        System.out.println();
        System.out.println(6 * areaOfTheTriangle(A));
    }

    public static double areaOfTheTriangle(int A) {
        return A * sqrt(3) / 4;
    }
}