package baekjoon.level16;

import java.util.Scanner;

public class n_1149 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int cost[][] = new int[n+1][3];
        for(int i=1; i<=n; i++){
            int r = scanner.nextInt();
            int g = scanner.nextInt();
            int b = scanner.nextInt();

            cost[i][0]= Math.min(cost[i-1][1], cost[i-1][2]) + r;
            cost[i][1]= Math.min(cost[i-1][0], cost[i-1][2]) + g;
            cost[i][2]= Math.min(cost[i-1][0], cost[i-1][1]) + b;
        }
        System.out.println(Math.min(cost[n][0], Math.min(cost[n][1], cost[n][2])));
    }
}
