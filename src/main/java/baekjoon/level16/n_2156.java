package baekjoon.level16;

import java.util.Scanner;

public class n_2156 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n+1];
        int[] dp = new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i] = scanner.nextInt();
        }
        dp[1]=arr[1];
        if(n>1){
            dp[2]= arr[1]+arr[2];
        }

        for(int i=3; i<=n; i++){
            dp[i]=  Math.max(dp[i - 1], Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]));
        }

        System.out.println(dp[n]);

    }
}
