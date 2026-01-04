package boj.p30802;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<6;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int sumT=0;
        for(int i=0;i<6;i++){
            sumT += (arr[i]/T);
            if(arr[i]%T!=0){sumT++;}
        }
        System.out.print(sumT+"\n"+N/P+" "+N%P);


    }
}