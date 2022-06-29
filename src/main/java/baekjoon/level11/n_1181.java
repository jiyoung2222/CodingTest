package baekjoon.level11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class n_1181 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        String[] arr = new String[n];

        for(int i=0; i<n; i++){
            arr[i]= scanner.next();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 단어 길이가 같을 경우
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2);	// 사전 순 정렬
                }
                else{
                    return o1.length()-o2.length();
                }

            }
        });



        System.out.println(arr[0]);

        for (int i = 1; i < n; i++) {
            // 중복되지 않는 단어만 출력
            if (!arr[i].equals(arr[i - 1])) {
                System.out.println(arr[i]);
            }
        }

    }
}
