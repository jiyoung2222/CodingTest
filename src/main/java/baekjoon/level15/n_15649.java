package baekjoon.level15;

import java.util.Scanner;

public class n_15649 {
    public static boolean visit[];
    public static int arr[];

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        visit= new boolean[10];
        arr= new int[10];
        func(0, n, m);
    }

    public static void func(int depth, int n, int m){
        if(depth==m){
            for(int i=0; i<m; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }
        else{
            for(int i=1; i<=n; i++){
                if(visit[i])
                    continue;
                visit[i]=true;
                arr[depth]=i;
                func(depth+1, n, m);
                visit[i]=false;
            }
        }
    }
}
