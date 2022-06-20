package baekjoon.level4;

import java.util.Scanner;

public class n_4344 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int c= scanner.nextInt();
        for (int i=0; i<c; i++){
            double sum=0;
            double avg=0;
            double count=0;
            double result=0;
            int n= scanner.nextInt();
            int arr[] = new int[n];
            for(int j=0; j<n; j++){
                arr[j] = scanner.nextInt();
                sum += arr[j];
            }
            avg = sum/n;
            for(int j=0; j<n; j++){
                if(arr[j]>avg)
                    count++;
            }
            System.out.printf("%.3f%%\n", (count/n)*100);
        }
        scanner.close();
    }
}
