package baekjoon.level3;
import java.util.Scanner;

public class n_1110 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int count=0;
        int nums=n;
        while(true){
            int a= nums/10;
            int b= nums%10;
            nums=(a+b)%10 + (b*10);
            count++;

            if(nums==n){    //사이클이 돌아 처음 값과 같아지면
                break;
            }
        }
        System.out.println(count);
    }
}
