package baekjoon.level13;

import java.util.Scanner;

public class n_4153 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if(a==0 && b==0 && c==0)
                break;

            if((a * a + b * b) == c * c) {
                System.out.println("right");
            }
            else if(a * a == (b * b + c * c)) {
                System.out.println("right");
            }
            else if(b * b == (c * c + a * a)) {
                System.out.println("right");
            }
            else {
                System.out.println("wrong");
            }
        }
    }
}
