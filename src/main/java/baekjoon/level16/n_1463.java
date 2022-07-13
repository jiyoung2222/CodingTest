package baekjoon.level16;

import java.util.Scanner;

public class n_1463 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int dp[]= new int[n+1];
        dp[0]=0;
        dp[1]=0;
        for(int i=2; i<=n; i++){
            dp[i]= dp[i-1]+1; // 먼저 1을 빼준다
            if(i%2==0){
                dp[i]= Math.min(dp[i], dp[i/2]+1); // 1을 뺀 값과 2로 나눈 값 중 최솟값을 dp[i]에 저장
            }
            if(i%3==0){
                dp[i]= Math.min(dp[i], dp[i/3]+1); // 1을 뺀 값과 2로 나눈 값 중 최소값인 dp[i] 와 3으로 나눈 값 중 최솟값을 dp[i]에 저장
            }
        }
        System.out.println(dp[n]);
    }
}
