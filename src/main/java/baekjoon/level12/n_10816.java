package baekjoon.level12;

import java.util.Arrays;
import java.util.Scanner;

public class n_10816 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        int[] card = new int[n];
        for(int i=0; i<n; i++){
            card[i]= scanner.nextInt();
        }
        Arrays.sort(card);

        int m=scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++){
            int key= scanner.nextInt();
            sb.append(upper(card, key)- lower(card, key)).append(' ');
        }

        System.out.println(sb);

    }

    private static int lower(int[] card, int key){
        int low=0;
        int high= card.length;

        while(low<high){
            int mid= (low+high)/2;

            if(key<=card[mid]){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    private static int upper(int[] card, int key){
        int low=0;
        int high= card.length;

        while(low<high){
            int mid= (low+high)/2;

            if(key<card[mid]){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
