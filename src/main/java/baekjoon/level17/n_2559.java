package baekjoon.level17;

import java.util.Scanner;

public class n_2559 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int m = scanner.nextInt();
        int arr[]= new int[n+1];
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            arr[i]= scanner.nextInt();
        }

        for(int i=0; i<=n-m; i++){
            int sum=0;
            for(int j=i; j<i+m; j++){
                sum+=arr[j];
            }
            max= Math.max(max, sum);
        }

        System.out.println(max);
    }
}
