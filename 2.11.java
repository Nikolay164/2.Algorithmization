import static java.lang.Math.random;

class massive211 {
    public static void main(String[] args) {
        int[][] a = new int[10][20];
        int numMax = 15;
        int numMin = 0;
        int chet = 0;
        int chetZero = 0;
        System.out.println("Исходный массив :");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (random() * ((numMax - numMin) + 1)) + numMin;
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }
        System.out.print("Строки, в которых число 5 встречается 3 и более раз: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 5) {
                    chet++;
                }
            }
            if (chet >= 3) {
                System.out.print(i + " ");
                chetZero++;
            }
            chet = 0;
        }
        if (chetZero == 0) {
            System.out.println("такие строки отсутствуют");
        }
    }
}


