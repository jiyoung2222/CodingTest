package baekjoon.level13;

import java.util.Scanner;

public class n_3009 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int x1= scanner.nextInt();
        int y1= scanner.nextInt();
        int x2= scanner.nextInt();
        int y2= scanner.nextInt();
        int x3= scanner.nextInt();
        int y3= scanner.nextInt();

        if(x1==x2)
            System.out.print(x3+" ");
        else{
            if(x1==x3)
                System.out.print(x2+" ");
            else
                System.out.print(x1+" ");
        }

        if(y1==y2)
            System.out.print(y3);
        else{
            if(y1==y3)
                System.out.print(y2+" ");
            else
                System.out.print(y1+" ");
        }
    }
}
