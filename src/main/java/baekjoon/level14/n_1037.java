package baekjoon.level14;

import java.util.Arrays;
import java.util.Scanner;

public class n_1037 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int num[] = new int[a];
        for(int i=0; i<a; i++){
            num[i]= scanner.nextInt();
        }

        Arrays.sort(num);

        System.out.println(num[a-1]*num[0]);
    }
}
