package baekjoon.level15;

import java.util.Scanner;

public class n_15652 {

    public static int[] arr;
    public static int N, M;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        arr = new int[M];

        dfs(1, 0);

    }

    public static void dfs(int at, int depth) {

        if (depth == M) {
            for(int i=0; i< arr.length; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }

        for (int i = at; i <= N; i++) {

            arr[depth] = i;
            dfs(i , depth + 1);

        }
    }
}