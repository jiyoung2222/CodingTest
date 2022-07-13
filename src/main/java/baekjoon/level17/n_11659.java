package baekjoon.level17;

import java.util.Scanner;

public class n_11659 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr= new int[n+1];
        arr[0]=0;

        for(int i=1; i<=n; i++){
            arr[i]= arr[i-1]+ scanner.nextInt();

        }

        for(int i=0; i<m; i++){
            int a= scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(arr[b]-arr[a-1]);

        }
    }
}
