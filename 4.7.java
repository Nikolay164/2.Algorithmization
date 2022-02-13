class Massive47 {

    public static void main(String[] args) {
        System.out.println("Сумма факториалов нечетных чисел от 1 до 9 равна " + summa());
    }

    public static int factorial(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f = f * i;
        }
        return f;
    }

    public static int summa() {
        int sum = 0;
        for (int i = 1; i <= 9; i = i + 2) {
            sum = sum + factorial(i);
        }
        return sum;
    }
}