package baekjoon.level12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class n_10815 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n= scanner.nextInt();
        int[] card = new int[n];
        for(int i=0; i<n; i++){
            card[i]= scanner.nextInt();
        }

        Arrays.sort(card);
        int m = scanner.nextInt();

        for(int i=0; i<m; i++){
            int com = scanner.nextInt();
            int left=0;
            int right=n-1;
            while(left<=right){
                int mid = (left+right)/2;
                if(card[mid]==com){
                    sb.append(1+" ");
                    break;
                }
                if(card[mid]>com){
                    right= mid-1;
                }
                else{
                    left=mid+1;
                }
                if(left>right){
                    sb.append(0+" ");
                    break;
                }
            }
        }
        System.out.println(sb);

    }
}
