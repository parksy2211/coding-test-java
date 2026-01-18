package boj.p31403;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A = br.readLine();
        String B = br.readLine();
        String C = br.readLine();

        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B);
        int c = Integer.parseInt(C);

        System.out.println(a + b - c);               // 1) 숫자로 계산
        System.out.println(Integer.parseInt(A + B) - c); // 2) 문자열로 이어붙인 후 계산
    }
}