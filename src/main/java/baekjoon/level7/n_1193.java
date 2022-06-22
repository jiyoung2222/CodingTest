package baekjoon.level7;

import java.util.Scanner;

public class n_1193 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n= scanner.nextInt();
        int count=1;    //count-1: 몇번째 대각선
        while(n>0){
            n=n-count;  // 대각선의 해당 순서만큼 그 안에 분수들이 존재(해당 대각선의 분수개수). 따라서 개수만큼 빼주다가 0이하이면 해당 대각선 행에 n번째 분수 존재
            count++;
        }
        int a = (count-1)+n;
        int b = count-a;

        if(count%2==1){ //해당 대각선의 행 (= count-1) 이 홀수이면 아래서부터 위로, 짝수이면 위에서부터 아래로 진행
            System.out.println(a+"/"+b);
        }
        else{
            System.out.println(b+"/"+a);
        }

    }
}
