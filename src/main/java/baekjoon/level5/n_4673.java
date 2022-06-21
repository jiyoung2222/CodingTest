package baekjoon.level5;

public class n_4673 {

    public static void main(String[] args){

        boolean[] arr = new boolean[10001];

        for(int i=1; i<10001; i++){
            int index= checkNum(i);

            if(index<10001)
                arr[index]=true;
        }

        for(int i=1; i<10001; i++){
            if(!arr[i])
                System.out.println(i);
        }
    }

    private static int checkNum(int num){
        int sum=num;

        while(num!=0){
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
}
