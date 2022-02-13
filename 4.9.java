import static java.lang.Math.*;

import java.util.Scanner;

class Massive49 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длины сторон четырехугольника: ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        boolean isTriangleExists = C(A, B, C, D);
        if (isTriangleExists) {
            System.out.printf("Площадь четырехугольника равна %.2f", B(A, B, C, D));
        } else {
            System.out.println("Четырехугольника с такими сторонами не существует");
        }
    }


    public static double A(int A, int B) {
        return sqrt(A * B + A * B);
    }


    public static double B(int A, int B, int C, int D) {
        double area1 = (A * B) / 2;
        double E = A(A, B);
        double halfPerimetr = (A + D + E) / 2;
        double area2 = sqrt(halfPerimetr * (halfPerimetr - C) * (halfPerimetr - D) * (halfPerimetr - E));
        return area1 + area2;
    }


    public static boolean C(int A, int B, int C, int D) {
        double sideE = A(A, B);
        if (C > 0 && D > 0 && sideE > 0) {
            if (C + D > sideE && C + sideE > D && D + sideE > C) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}