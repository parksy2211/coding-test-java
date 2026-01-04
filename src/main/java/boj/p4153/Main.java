package boj.p4153;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a==0){
                break;
            }
            int[] arr = {a,b,c};
            Arrays.sort(arr);

            if(arr[0]*arr[0]+arr[1]*arr[1]==arr[2]*arr[2]){
                sb.append("right").append("\n");
            }else {
                sb.append("wrong").append("\n");
            }
        }

        System.out.print(sb.toString());
    }
}
