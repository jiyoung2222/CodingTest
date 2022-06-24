package baekjoon.level8;

import java.util.Scanner;

public class n_9020 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i=0; i<n; i++){
            int num= scanner.nextInt();
            boolean arr[] = new boolean[num+1]; //해당 수의 소수 여부 (f: 소수, t: 소수아님)

            for(int j=1; j<=num; j++){
                if(j==1)
                    arr[j]=true;
                else if(arr[j]==false){
                    for(int k=2;j*k<=num;k++) {
                        arr[j*k]=true;
                    }
                }
            }

            for(int j=num/2; j>1; j--){
                if(arr[j]==false){
                    if(arr[num-j]==false){
                        System.out.println(j+" "+(num-j));
                        break;
                    }
                }
            }

        }
    }
}
