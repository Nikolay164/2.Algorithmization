import java.util.Scanner;

class Massive411 {

    private static String sravnenie(int first, int second) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число,которое разбить для формирования массива: ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.println(A + " сравнивается с " + B);
        if (A == B) {
            return "Длина одинакова";
        } else {
            return (A > B) ? ("Первое число больше") : ("Второе число больше");
        }
    }

    public static void main(String[] args) {
        System.out.println(sravnenie(99999, -8888));
        System.out.println(sravnenie(-199999, 299999));
    }
}