package baekjoon.level8;

import java.util.Scanner;

public class n_11653 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num= scanner.nextInt();
        int n=2;
        String st="시작";
        if(num==1)
            st="끝";
        else{
            while(true){
                if(num==1)
                    break;
                if(num%n==0){
                    num=num/n;
                    System.out.println(n);
                }
                n++;
            }
        }
    }
}
