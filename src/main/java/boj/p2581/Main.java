package boj.p2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0,min=Integer.MAX_VALUE;
        int count=0;

        //소수구하기 반북 M부터 N까지
        for (int i=M;i<=N;i++){


            //M에서 -1 씩 1까지가서
            for( int j=2;j<=i;j++){
                   if(i%j ==0) {
                       count++;
                   }
                   if(count>2){break;}
            }
            //소수인것만 sum함
            if(count == 1){
                if(min > i){
                    min =i;

                }
                sum += i;
            }
            count=0;
        }
        if(sum==0){
            System.out.print("-1");
        }else{
            System.out.print(sum+"\n"+min);
        }
    }
}
