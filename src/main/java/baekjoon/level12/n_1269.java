package baekjoon.level12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class n_1269 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count=0;
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<n; i++){
            hs.add(scanner.nextInt());
        }

        for(int i=0; i<m; i++){
            Integer num = scanner.nextInt();
            if(hs.contains(num)){
                count++;
            }
        }

        System.out.println((n+m)-(2*count));
    }
}
