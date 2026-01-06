package boj.p11866;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<Integer>();
        StringBuilder sb = new StringBuilder("<");
        for(int i=1;i<=N;i++){
            list.add(i);
        }
        int idx=0;
        while(!list.isEmpty()) {
            idx = (idx+K-1)%list.size();
            sb.append(list.remove(idx));
            if(!list.isEmpty()){sb.append(", ");}
        }
        sb.append(">");
        System.out.print(sb.toString());

    }
}
