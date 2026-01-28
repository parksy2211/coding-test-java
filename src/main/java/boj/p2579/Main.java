package boj.p2579;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        int[] s = new int[n+1];
        for(int i=1;i<=n;i++) {
            s[i] = Integer.parseInt(br.readLine().trim());
        }
        if(n == 1) {
            System.out.println(s[1]);
            return;
        }
        if(n == 2) {
            System.out.println(s[1]+s[2]);
            return;
        }
        int[] dp = new int[n+1];
        dp[1] = s[1];
        dp[2] = s[1]+s[2];
        dp[3] = Math.max(s[1]+s[3],s[2]+s[3]);
        for(int i=4;i<=n;i++) {
            dp[i] = Math.max(dp[i-3]+s[i-1]+s[i],dp[i-2]+s[i]);
        }
        System.out.println(dp[n]);
    }
}
