package baekjoon.level9;

import java.util.Scanner;

public class n_10872 {
    static int res=1;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n= scanner.nextInt();
        System.out.println(mul(n));
    }

    public static int mul(int num){

        if(num==0)
            return res;
        else{
            res*=num;
            return mul(num-1);
        }

    }
}
