package baekjoon.level5;

import java.util.Scanner;

public class n_1065 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(checkNum(n));
        }

    private static int checkNum(int n){
        int count=99;
        if(n<100)
            count=n;
        else{
            for(int i=100; i<=n; i++){
                int a = i/100;
                int b = (i/10)%10;
                int c = (i%10);

                if((b-a)==(c-b))
                    count++;
            }
        }

        return count;

    }
}
