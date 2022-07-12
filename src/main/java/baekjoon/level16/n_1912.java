package baekjoon.level16;

import java.util.Scanner;

public class n_1912 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n+1];
        int sum[] = new int[n+1];
        for(int i=0; i<n; i++){
            arr[i]= scanner.nextInt();
        }
        sum[0]=arr[0];
        for(int i=1; i<n; i++){
            if(sum[i-1]+arr[i]>arr[i]){
                sum[i]= sum[i-1]+arr[i];
            }
            else{
                sum[i]= arr[i];
            }
        }

        int max=sum[0];
        for(int i=1; i<n; i++){
            if(max<sum[i])
                max=sum[i];
        }

        System.out.println(max);


    }
}
