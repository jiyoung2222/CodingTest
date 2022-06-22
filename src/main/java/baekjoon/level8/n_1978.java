package baekjoon.level8;

import java.util.Scanner;

public class n_1978 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();

        int arr[] = new int[n];
        int count=0;

        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        for(int j=0; j< arr.length; j++){
            int num=2;
            while(true){
                if(num==arr[j]){
                    count++;
                    break;
                    }
                if(arr[j]==1)
                    break;
                else{
                    if(arr[j]%num==0)
                        break;
                }
                num++;
            }
        }


        System.out.println(count);
    }
}
