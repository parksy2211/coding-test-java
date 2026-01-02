package boj.p1012;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());


        //벌레심기 시작
        for(int i=0;i<T;i++) {
            int sum = 0; ///총 심은 벌레 개수
            StringTokenizer st = new StringTokenizer(br.readLine());

            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            ///농장에 배추위치에 1 넣기
            int[][] farm = new int[M+2][N+2];
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                farm[a+1][b+1] = 1;
            }
            ///최적위치에 지렁이 심기

            for(int w=5;w>0;w--) {
                for(int o=1;o<=M;o++) {
                    for(int p=1;p<=N;p++) {
                        if(w == farm[o-1][p]+farm[o][p]+farm[o+1][p]+farm[o][p+1]+farm[o][p-1]){
                            sum +=1;
                            farm[o-1][p] = 0;
                            farm[o][p] = 0;
                            farm[o+1][p] = 0;
                            farm[o][p+1] = 0;
                            farm[o][p-1] = 0;
                        }
                    }
                }
            }
            System.out.println(sum);
        }

    }
}
