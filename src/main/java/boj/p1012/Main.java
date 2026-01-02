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
            Stack<Integer> stack = new Stack<>();
            int count = 0;
            ///농장에 배추위치에 1 넣기
            int[][] farm = new int[M][N];
            int[][] visited = new int[M][N];
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                farm[a][b] = 1;
            }
            for (int o=0;o<M;o++) {
                for(int p=0;p<N;p++) {
                    if(farm[o][p]==1){


                    }
                }
            }






        }

    }
}
