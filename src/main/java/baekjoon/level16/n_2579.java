package baekjoon.level16;

import java.util.Scanner;

public class n_2579 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int arr[]= new int[301];
        int sum[]= new int[301];
        for(int i=0; i<n; i++){
            arr[i]= scanner.nextInt();
        }
        sum[0]=arr[0];
        sum[1]= arr[0]+arr[1];
        sum[2]= Math.max(arr[0],arr[1]) + arr[2];

        for(int i=3; i<n; i++){
            sum[i]= Math.max(sum[i-3]+arr[i-1], sum[i-2])+ arr[i];
        }

        System.out.println(sum[n-1]);

    }
}
