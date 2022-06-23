package baekjoon.level8;

import java.util.Scanner;

public class n_1929 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean [] A = new boolean[m+1];
        for(int i=1;i<=m;i++) {
            if(i==1) {
                A[i]=true;
            } else if(A[i]==false){
                for(int j=2;i*j<=m;j++) {
                    A[i*j]=true;
                }
            }
        }
        for(int i=n;i<=m;i++) {
            if(A[i]==false) {
                System.out.println(i);
            }
        }
    }
}