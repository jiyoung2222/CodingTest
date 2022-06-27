package baekjoon.level10;

import java.util.Scanner;

public class n_2798 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int card[] = new int[a+1];
        for(int i=0; i<a; i++){
            card[i]= scanner.nextInt();
        }

        int sum=0;
        int res=0;

        for(int i=0;i<a-2; i++){
            for(int j=i+1; j<a-1; j++){
                for(int k=j+1; k<a; k++){
                    sum=card[i]+card[j]+card[k];
                    if(sum<=b && sum>=res)
                        res=sum;
                }
                sum=0;
            }
        }

        System.out.println(res);
    }
}
