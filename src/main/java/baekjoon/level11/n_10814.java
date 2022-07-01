package baekjoon.level11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class n_10814 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String [][] person = new String[n][2];

        for(int i=0; i<n; i++){
            person[i][0]= scanner.next();
            person[i][1]= scanner.next();
        }

        Arrays.sort(person, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for(int i=0; i<n; i++){
            System.out.println(person[i][0]+ " "+ person[i][1]);
        }


    }
}
