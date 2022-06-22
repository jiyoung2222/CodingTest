package baekjoon.level2;
import java.util.Scanner;

public class n_14681 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int a = scanner.nextInt();  //x축 좌표
        int b = scanner.nextInt();  //y축 좌표

        if(a>0){
            if(b>0) {
                System.out.println("1");
            }
            else{
                System.out.println("4");
            }
        }
        else{
            if(b>0) {
                System.out.println("2");
            }
            else {
                System.out.println("3");
            }

        }
    }
}
