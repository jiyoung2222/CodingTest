package baekjoon.level8;
import java.util.Scanner;

public class n_4948 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            int count = 0;
            int[] a = new int[2 * n + 1];
            for (int i = 1; i <= 2 * n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i * j > 2 * n)
                        break;
                    a[i * j]++;
                }
            }
            for (int i = n + 1; i <= 2 * n; i++) {
                if (a[i] == 1)
                    count++;
            }
            System.out.println(count);

        }
    }
}