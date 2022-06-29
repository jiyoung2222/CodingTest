package baekjoon.level11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class n_1427 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String number = String.valueOf(n);
        String[] numbers = number.split("");

        ArrayList<Integer> num = new ArrayList<Integer>();
        for (int i=0; i< numbers.length; i++){
            num.add(Integer.parseInt(numbers[i]));
        }

        num.sort(Comparator.reverseOrder());

        for(int i=0; i<num.size(); i++){
            System.out.print(num.get(i));
        }

    }
}
