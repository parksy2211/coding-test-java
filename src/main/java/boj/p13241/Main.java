package boj.p13241;
import java.util.*;
import java.io.*;
//유클리드호제법 사용

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        Long A = Long.parseLong(st.nextToken());
        Long B = Long.parseLong(st.nextToken());
        long a=Math.max(A,B),b=Math.min(A,B);

        while(b!=0){
            long r=a%b;
            a=b;
            b=r;
        }
        System.out.print(A*B/a);
    }
}
