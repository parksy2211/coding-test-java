package boj.p18258;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> q = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++) {
            String input = br.readLine();
            if(input.startsWith("push")) {
                int x = Integer.parseInt(input.split(" ")[1]);
                q.addLast(x);
            }
            else if(input.equals("pop")){
                sb.append(q.isEmpty()?-1:q.pollFirst()).append('\n');
            }
            else if(input.equals("size")){
                sb.append(q.size()).append('\n');
            }
            else if(input.equals("empty")){
                sb.append(q.isEmpty()?1:0).append('\n');
            }
            else if(input.equals("front")){
                sb.append(q.isEmpty()?-1:q.peekFirst()).append('\n');
            }
            else if(input.equals("back")){
                sb.append(q.isEmpty()?-1:q.peekLast()).append('\n');
            }
        }
        System.out.println(sb.toString());
    }
}
