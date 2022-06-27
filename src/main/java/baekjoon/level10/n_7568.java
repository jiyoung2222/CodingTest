package baekjoon.level10;

import java.util.Scanner;

public class n_7568 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int wei[] = new int[n+1];
        int hei[] = new int[n+1];
        int count[] = new int[n+1];
        int rank;

        for(int i=0; i<n; i++){
            wei[i]= scanner.nextInt();
            hei[i]= scanner.nextInt();
            count[i]=1;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if((wei[i]<wei[j]) && (hei[i]<hei[j]))
                    count[i]++;
            }
        }

        for(int i=0; i<n; i++)
            System.out.print(count[i] +" ");

    }
}
