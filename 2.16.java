import java.util.Scanner;

class Massive216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Введите число n: ");
            n = sc.nextInt();
        }
        while (n % 2 == 0);
        int[][] a = new int[n][n];
        int i = n / 2;
        int j = n - 1;

        for (int f = 1; f <= n * n; f++) {
            if (i == -1)
                if (j == n) {
                    i = 0;
                    j = n - 2;
                } else
                    i = n - 1;
            else {
                if (j == -1)
                    j = n - 1;
                if (i == n)
                    i = 0;
                if (j == n)
                    j = 0;
            }
            if (a[i][j] != 0) {
                j -= 2;
                ++i;
            }

            a[i][j] = f;
            i--;
            j++;

        }

        for (int k = 0; k < n; k++) {
            System.out.println();
            for (int l = 0; l < n; l++) {
                System.out.print(a[k][l] + " ");
            }
        }
    }
}