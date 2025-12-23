package boj.p13458;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st,st1;

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];


        st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        long p = N;
        for(int i=0; i<arr.length; i++) {
            long temp=arr[i]-b;
            if(temp > 0){
                p += temp/c;
                if(temp%c !=0){
                    p++;
                }
            }
        }
        System.out.printf("%d",p);
    }
}
