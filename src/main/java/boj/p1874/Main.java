package boj.p1874;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int topNum = 1;
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(br.readLine());
                while(topNum<= arr[i]){
                    stack.push(topNum++);
                    sb.append("+\n");
                }

                if(!stack.isEmpty() && stack.peek()==arr[i] ){
                    stack.pop();
                    sb.append("-\n");
                }else{
                    System.out.print("NO");
                    return;
                }
        }
        System.out.print(sb.toString());

    }
}
