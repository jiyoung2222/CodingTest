package baekjoon.level13;

import java.util.Scanner;

public class n_1085 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int short_x=0;
        int short_y=0;
        int res=0;

        if(x>=w)
            short_x= x-w;
        else
            short_x=w-x;
        if(short_x>x)
            short_x=x;

        if(y>=h)
            short_y= y-h;
        else
            short_y=h-y;
        if(short_y>y)
            short_y=y;

        res=short_x;
        if(res>short_y)
            res=short_y;

        System.out.println(res);


    }
}
