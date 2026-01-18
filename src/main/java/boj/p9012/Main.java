package boj.p9012;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
            Stack<Integer> stack = new Stack();
            boolean tf = true;
            String a = br.readLine();
            for(int j=0;j<a.length();j++) {
                if(!stack.isEmpty() &&a.charAt(j)==')') {
                    stack.pop();
                } else if (a.charAt(j)=='(') {
                    stack.push(1);
                }else {
                    tf = false;
                    break;
                }
            }
            if(tf && stack.isEmpty()){
                sb.append("YES\n");
            }else{
                sb.append("NO\n");
            }
        }
        System.out.print(sb.toString());
    }
}
