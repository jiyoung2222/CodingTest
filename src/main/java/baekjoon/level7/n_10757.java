package baekjoon.level7;

import java.math.BigInteger;
import java.util.Scanner;

public class n_10757 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        BigInteger a= scanner.nextBigInteger();
        BigInteger b= scanner.nextBigInteger();

        System.out.println(a.add(b));

        scanner.close();
    }
}
