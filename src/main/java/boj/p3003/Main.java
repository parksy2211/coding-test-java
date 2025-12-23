package boj.p3003;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //StringTenizer는 문자열 분리하는기능
        st = new StringTokenizer(br.readLine());

        //원래 체스말
        int[] b = {1,1,2,2,2,8};

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<6;i++){
            int N = Integer.parseInt(st.nextToken());

            sb.append(b[i]-N+" ");
        }
        System.out.printf(sb.toString());
    }
}
