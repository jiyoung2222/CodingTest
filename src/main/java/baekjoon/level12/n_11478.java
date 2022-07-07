package baekjoon.level12;

import java.util.HashSet;
import java.util.Scanner;

public class n_11478 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        String word = scanner.next();

        HashSet<String> hs = new HashSet<>();

        for(int i=0; i<=word.length(); i++){
            for(int j=i+1; j<=word.length(); j++){
                if(!hs.contains(word.substring(i, j))){
                    hs.add(word.substring(i, j));
                }
            }
        }

        System.out.println(hs.size());
    }
}
