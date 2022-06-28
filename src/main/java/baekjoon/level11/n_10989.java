package baekjoon.level11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n_10989 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int count[] = new int[10001];

        for(int i=0; i<n; i++){
            count[Integer.parseInt(br.readLine())]++;
        }

        for(int i=0; i<10001; i++){
            while(count[i]>0){
                sb.append(i).append('\n');
                count[i]--;
            }
        }

        System.out.println(sb);
    }
}
