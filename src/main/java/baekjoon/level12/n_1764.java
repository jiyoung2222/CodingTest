package baekjoon.level12;

import java.util.*;

public class n_1764 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        HashSet<String> hs = new HashSet<>();
        ArrayList<String> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            hs.add(scanner.next());
        }
        for(int i=0; i<m; i++){
            String s = scanner.next();
            if(hs.contains(s)){
                arr.add(s);
            }
        }
        Collections.sort(arr);
        System.out.println(arr.size());
        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}
