package baekjoon.level11;

import java.util.Arrays;
import java.util.Scanner;

public class n_2750 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num[] = new int[n];

        for(int i=0; i<n; i++)
            num[i]= scanner.nextInt();

        Arrays.sort(num);

        for(int i=0; i<n; i++){
            System.out.println(num[i]);
        }
    }
}
