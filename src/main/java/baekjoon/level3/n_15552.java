package baekjoon.level3;

import java.io.*;
import java.util.StringTokenizer;

public class n_15552 {
    public static void main(String[] args){
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            int num= Integer.parseInt(bfr.readLine());  //계산할 행의 개수
            for (int i=0; i<num; i++){
                String s= bfr.readLine();

                StringTokenizer st = new StringTokenizer(s);
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                bfw.write((a+b)+"\n");
            }
            bfw.close();

        }
        catch (IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
