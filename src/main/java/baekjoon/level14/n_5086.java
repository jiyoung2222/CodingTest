package baekjoon.level14;

import java.util.Scanner;

public class n_5086 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            int a = scanner.nextInt();
            int b =scanner.nextInt();
            if(a==0 && b==0)
                break;

            if(a>b){
                if(a%b==0){
                    System.out.println("multiple");
                }
                else{
                    System.out.println("neither");
                }
            }
            else{
                if(b%a==0){
                    System.out.println("factor");
                }
                else{
                    System.out.println("neither");
                }
            }
        }
    }
}
