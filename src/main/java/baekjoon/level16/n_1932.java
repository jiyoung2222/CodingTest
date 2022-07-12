package baekjoon.level16;

import java.util.Scanner;

public class n_1932 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[][] arr = new int[n][];
        for(int i=0; i<n; i++){
            arr[i]= new int[i+1];
            for(int j=0; j<=i; j++){
                arr[i][j]=scanner.nextInt();
            }
        }


        for(int i=n-1; i>=0; i--){
            for(int j=0; j<i; j++){
                arr[i-1][j] += Math.max(arr[i][j], arr[i][j+1]);
            }
        }

        System.out.println(arr[0][0]);
    }
}
