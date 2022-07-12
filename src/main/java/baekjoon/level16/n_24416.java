package baekjoon.level16;

import java.util.Scanner;

public class n_24416 {

    public static int n;
    public static int f[];
    public static int count=0;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        n= scanner.nextInt();
        System.out.println(fib(n)+" "+ fibonacci(n));
    }

    public static int fib(int n) {
        if (n == 1 || n == 2)
            return 1;
        else
            return (fib(n - 1) + fib(n - 2));
    }

    public static int fibonacci(int n) {
        f= new int[n+1];
        f[1]=1;
        f[2] =1;
        count=0;
        for(int i=3; i<n+1; i++){
            f[i] = f[i - 1] + f[i - 2];
            count++;
        }
        return count;
    }
}
