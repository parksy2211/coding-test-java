package boj.p12789;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[] arr = new int[n];
        int p = 0;
        int count = 1;
        //StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s);
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<n;i++) {
            if(p!=n && arr[p]==count) {
                //sb.append(arr[p]).append(' ');
                count++;
                p++;
            }else if(!stack.isEmpty() && stack.peek()==count){
                //sb.append(stack.peek()).append(' ');
                stack.pop();
                count++;
            }else {
                while(p<n && arr[p]!=count){
                    stack.push(arr[p++]);
                }
                if(p==n) {
                    System.out.println("Sad");
                    return;
                }else{
                    //sb.append(arr[p]).append(' ');
                    p++;
                    count++;
                }
            }
        }
        System.out.println("Nice");
    }
}