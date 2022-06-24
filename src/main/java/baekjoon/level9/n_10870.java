package baekjoon.level9;

import java.util.Scanner;

public class n_10870 {
    static int n=0;
    static int sum1=0;  //n의 2번째 전 피보나치 수열
    static int sum2=1;  //n의 1번째 전 피보나치 수열
    static int res=0;   ////n의 피보나치 수열
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        n= scanner.nextInt();

        System.out.println(sum(0));
    }

    public static int sum(int num){
        if(num==0 || num==1){
            res=num;
        }
        else{
            sum1=sum2;
            sum2=res;
        }
        if(num==n){
            return res;
        }
        else{
            res=sum1+sum2;
            return sum(num+1);
        }
    }
}
