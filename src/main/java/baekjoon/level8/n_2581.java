package baekjoon.level8;

import java.util.Scanner;

public class n_2581 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int a= scanner.nextInt();
        int b = scanner.nextInt();

        int sum=0;
        int count=0;
        int min=0;

        for(int i=b; i>=a; i-- ){
            int num=2;
            while(true){
                if(num==i){
                    count++;
                    sum+=i;
                    min=i;
                    break;
                }
                if(i==1)
                    break;
                else{
                    if(i%num==0)
                        break;
                }
                num++;
            }
        }

        if(count==0)
            System.out.println("-1");
        else{
            System.out.println(sum);
            System.out.println(min);
        }

    }
}
