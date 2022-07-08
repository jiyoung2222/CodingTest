package baekjoon.level14;

import java.util.Scanner;

public class n_2609 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int min, max;

        if(a>=b){
            min=b;
            max=a;
        }
        else{
            min=a;
            max=b;
        }

        while(true){
            if(a%min==0 && b%min==0)
                break;
            else
                min--;
        }
        while(true){
            if(max%a==0 && max%b==0)
                break;
            else
                max++;
        }

        System.out.println(min);
        System.out.println(max);

    }
}
