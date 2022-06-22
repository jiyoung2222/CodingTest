package baekjoon.level3;
import java.util.Scanner;

public class n_11022 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i=0; i<num; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = a+b;
            System.out.println("Case #"+ (i+1) + ": "+ a + " + " + b + " = "+result);
        }
    }
}
