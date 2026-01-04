package boj.p14626;

import java.util.*;
import java.io.*;
public class Main {
    /// 9788968322*73   2
    ///
    /// a+3b+c...%10 = 0
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            int sum = 0, starIndex=0,star=0;

            starIndex = line.indexOf('*');
            for(int i=0;i<13;i++){
                if(i==starIndex) continue;
                int n = line.charAt(i)-'0';
                if(i%2==0){
                    sum += n;
                }else{
                    sum += n*3;
                }
            }
            int w = (starIndex%2 ==0)?1:3;
            for(int i=0;i<10;i++){
                if((sum+w*i)%10 == 0){
                    System.out.print(i);
                    break;
                }
            }
    }
}
