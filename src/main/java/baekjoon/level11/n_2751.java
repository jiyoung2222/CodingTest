package baekjoon.level11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class n_2751 {
    public static void main(String[] args) throws Exception{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bfr.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i =0; i<n; i++){
            arr.add(Integer.parseInt(bfr.readLine()));
        }

        Collections.sort(arr);

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            sb.append(arr.get(i)+"\n");
        }

        bfw.write(sb.toString());
        bfw.flush();
        bfw.close();
        bfr.close();
    }
}
