package baekjoon.level11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class n_18870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] arrClone;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        arrClone = arr.clone();

        Arrays.sort(arrClone);

        for (int i = 0; i < arrClone.length; i++) {
            if (!map.containsKey(arrClone[i])) {
                map.put(arrClone[i], count++);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            sb.append(map.get(arr[i])).append(" ");
        }

        System.out.println(sb);
    }
}