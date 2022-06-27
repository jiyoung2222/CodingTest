package baekjoon.level9;

import java.util.*;
public class n_2447 {

    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                f(i,j);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public static void f(int x, int y) {

        if(x < 3 && y < 3) {
            if(x % 3 == 1 && y % 3 == 1) {
                sb.append(" ");
            }
            else {
                sb.append("*");
            }
        } else {
            if(x % 3 == 1 && y % 3 == 1) {
                sb.append(" ");
            }
            else {
                f(x/3,y/3);
            }
        }
    }
}