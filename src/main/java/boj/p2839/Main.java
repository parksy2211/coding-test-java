package boj.p2839;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        int N = Integer.parseInt(br.readLine());
        int a = N/5;
        boolean t = false;
        if(N%5==0){
            t = true;
            System.out.print(a);
        }else {
            for(int i=a;i>=0;i--){
                int b = N-i*5;
                if(b%3==0){
                    System.out.printf("%d",i+b/3);
                    t = true;
                    break;
                }
            }
        }
        if(!t){
            System.out.print("-1");
        }
    }
}
