package baekjoon;

import java.util.Scanner;

public class n_2588 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1=scanner.nextInt(); //입력 받을 첫번째 정수
        int num2=scanner.nextInt(); //입력 받을 두번째 정수

        int a = num2 % 10;      //두번째 정수의 일의 자리
        int b = (num2%100)/10;  //두번째 정수의 십의 자리
        int c = (num2/100);     //두번째 정수의 백의 자리

        System.out.println(num1*a);
        System.out.println(num1*b);
        System.out.println(num1*c);
        System.out.println(num1*num2);
    }
}
