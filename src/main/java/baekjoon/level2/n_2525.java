package baekjoon.level2;

import java.util.Scanner;

public class n_2525 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        int plus = scanner.nextInt();

        int plus_h = plus/60;
        int plus_m = plus-(60*plus_h);

        min+=plus_m;
        if (min>=60){
            min-=60;
            plus_h++;
        }

        hour+=plus_h;
        if(hour>=24){
            hour-=24;
        }

        System.out.println(hour + " " + min);
    }
}
