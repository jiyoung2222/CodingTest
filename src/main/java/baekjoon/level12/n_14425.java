package baekjoon.level12;

import java.util.Scanner;

public class n_14425 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int m = scanner.nextInt();
        String[] word = new String[n];
        String[] arr = new String[m];
        int count=0;

        for(int i=0; i<n; i++){
            word[i]= scanner.next();
        }
        for(int i=0; i<m; i++){
            arr[i]= scanner.next();
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i].equals(word[j])){
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
