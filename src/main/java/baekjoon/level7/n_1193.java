package baekjoon.level7;

import java.util.Scanner;

public class n_1193 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n= scanner.nextInt();
        int count=1;
        while(n>0){
            n=n-count;
            count++;
        }
        int a = (count-1)+n;
        int b = count-a;

        if(count%2==1){
            System.out.println(a+"/"+b);
        }
        else{
            System.out.println(b+"/"+a);
        }

    }
}
